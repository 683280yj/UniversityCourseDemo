package com.chinasoft.upload.tool;

import java.util.UUID;

import javax.servlet.jsp.PageContext;

import com.jspsmart.upload.SmartFile;
import com.jspsmart.upload.SmartUpload;

public class ToolUtil {
	//a.jpg
	public static String getNewFileName(String fileName){
		String str[]=fileName.split("\\.");
		String typeName=str[str.length-1];//获得文件的后缀名
		//System.out.println(typeName);
		return UUID.randomUUID().toString()+"."+typeName;
	}
	
	
	public static String upload(PageContext pageContext){
		SmartUpload su=new SmartUpload();
		//javax.servlet.jsp.PageContext pageContext = javax.servlet.jsp.JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);
		String filePath="img\\";
		try {
			su.initialize(pageContext);
			su.upload();
			SmartFile file=su.getFiles().getFile(0);
			String fileName=file.getFileName();
			String newFileName=ToolUtil.getNewFileName(fileName);
			filePath+=newFileName;//改新的文件名字，独一无二的
			file.saveAs(filePath,SmartUpload.SAVE_VIRTUAL);
			String explain=su.getRequest().getParameter("explain");
			System.out.println(explain);//普通表单字段
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filePath;
	}
	
	
	
//	public static void main(String[] args) {
//		System.out.println(ToolUtil.getNewFileName("a.b.j.v.jpg"));
//		//for (int i = 0; i <10; i++) {
//			//System.out.println(UUID.randomUUID().toString());
//		//}
//	}

}
