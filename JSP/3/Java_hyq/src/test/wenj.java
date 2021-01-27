package test;

import java.io.File;

public class wenj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				File file = new File("hyq.txt");
				
				System.out.println("文件或目录是否存在"+file.exists());
				System.out.println("是文件吗：" + file.isFile());
			    System.out.println("是目录吗：" + file.isDirectory());
			    System.out.println("名称：" + file.getName());
			    System.out.println("绝对路径：" + file.getAbsolutePath());
			    System.out.println("文件大小：" + file.length());
			    
	}

}
