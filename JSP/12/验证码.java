package com.pxy.servlet;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewCode extends HttpServlet {
	private Random rand = new Random();
	private int width = 80;
	private int height = 30;
	private int fontsize = 14;
	private String str = "0123456789abcdefABCDEF";

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		//1. 创建图片对象
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//2. 创建画笔
//		Graphics pen = img.getGraphics();
		Graphics2D pen = img.createGraphics();		//(Graphics2D)img.getGraphics();
		//3. 随机生成验证码
		String code = randCode(4);
		//4. 绘制验证码
		pen.fillRect(0, 0, width, height);
		for (int i = 0; i < code.length(); i++) {
			pen.setColor(randColor());
			pen.setFont(new Font("微软雅黑", Font.BOLD, fontsize+rand.nextInt(4)));
			pen.drawString(code.charAt(i)+"", 10+fontsize*i, (height+fontsize)/2+rand.nextInt(5));
		}
		
		//5. 绘制干扰线
		for (int i = 0; i < 2; i++) {
			pen.setColor(randColor());
			pen.setStroke(new BasicStroke(3));
			pen.drawLine(rand.nextInt(width/2), rand.nextInt(height),
					rand.nextInt(width), rand.nextInt(height));
		}
		//6. 发送图片
		ServletOutputStream sos = response.getOutputStream();
		ImageIO.write(img, "png", sos);
		sos.flush();
		sos.close();
	}
	//随机颜色
	private Color randColor(){
		int r = rand.nextInt(256);
		int g = rand.nextInt(256);
		int b = rand.nextInt(256);
		return new Color(r,g,b);
	}
	//随机字符
	private String randCode(int len){
		width = 10 + len*fontsize;	//改变图片宽度
		String s = "";
		for (int i = 0; i < len; i++) {
			s += str.charAt(rand.nextInt(str.length()));
		}
		return s;
	}

}
