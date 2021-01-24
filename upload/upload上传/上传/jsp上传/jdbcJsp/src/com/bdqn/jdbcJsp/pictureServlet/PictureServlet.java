package com.bdqn.jdbcJsp.pictureServlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class PictureServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public PictureServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
//
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
////		out
////				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
////		out.println("<HTML>");
////		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
////		out.println("  <BODY>");
////		out.print("    This is ");
////		out.print(this.getClass());
////		out.println(", using the GET method");
////		out.println("  </BODY>");
////		out.println("</HTML>");
////		out.flush();
////		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//System.out.println(request.getParameter("name"));
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
	    String name=null;
	    String realPath=null;
	   String str=null;
		if(request.getParameter("status")==null){
			String Path=this.getServletContext().getRealPath("/")+"upload";
			//http://localhost:8080/jspPicture/upload/a.jpg
			System.out.println(Path);
				List<FileItem> items;
				try {
					boolean isMultipart=ServletFileUpload.isMultipartContent(request);
					if(isMultipart){
						System.out.println(request.getParameter("name"));
					FileItemFactory factory=new  DiskFileItemFactory();
					ServletFileUpload upload=new ServletFileUpload(factory);
					items = upload.parseRequest(request);
					Iterator<FileItem> it=items.iterator();//����
					while(it.hasNext()){
					FileItem item=(FileItem)it.next();
					System.out.println(item.isFormField());
					if(item.isFormField()){
						String fieldName=item.getFieldName();
						if(fieldName.equals("name")){
							//�õ���ͨ����ֵ
							 name=item.getString();
						}
//						
//					}
					}
					else{
						//�õ��ϴ��ļ�������
					//File fullFile=new File(item.getName());//����Դ�ļ�����
					str=UUID.randomUUID().toString()+"."+item.getName().split("\\.")[1];//�ļ�����
					File saveFile=new File(Path,str);
					item.write(saveFile);
					
					//�����һ�����ҵ�name�Լ���ַ��ֵ�����ҵ����ݿ�����룬�����Ҿ���ͨ����ַ�ҵ��ҵ�ͼƬ�ĵ�ַ��
					
					
					out.close();
					}
					System.out.println(name);
					System.out.println(item.getName());
					System.out.println(Path);
					//�õ����ַ�����ƴ��
					System.out.println(Path+"\\"+str+"."+item.getName().split("\\.")[1]);
					//insert(id,name,Path+"\\"+str+"."+item.getName().split("\\.")[1]);
				
					}
					}
				} catch (FileUploadException e1) {
					e1.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				}
			
		}
		
//		PrintWriter out = response.getWriter();
//		out
//				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
//		out.println("<HTML>");
//		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
//		out.println("  <BODY>");
//		out.print("    This is ");
//		out.print(this.getClass());
//		out.println(", using the POST method");
//		out.println("  </BODY>");
//		out.println("</HTML>");
//		out.flush();
//		out.close();

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
