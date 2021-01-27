package test_2_fuwuqi;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	private static final int PORT =9191;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			ServerSocket ss = new ServerSocket(PORT);
			System.out.println("开始监听...");
			Socket s = ss.accept();
			
			InputStream is = s.getInputStream();
			byte[] buffer = new byte[1024];			
			int len = is.read(buffer);				
			
			String msg = new String(buffer, 0, len);
			System.out.println("得到了客户端的消息："+msg);
			
			OutputStream os = s.getOutputStream();
			System.out.print("请输入：");
			String msg1 = input.next();
			
			os.write(msg.getBytes());
			
			s.close();
			ss.close();
			
			System.out.println("服务关闭...");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
