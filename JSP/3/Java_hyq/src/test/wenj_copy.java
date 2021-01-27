package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class wenj_copy {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
			File srcFile = new File("C:\\Users\\Administrator\\Workspaces\\MyEclipse Professional 2014\\Java_hyq\\hyq.txt");
			File desFile = new File("c:\\love\\Love.txt");
			if (!(desFile.exists())) {
				desFile.createNewFile();
			}
			FileInputStream fis = new FileInputStream(srcFile);
			FileOutputStream fos = new FileOutputStream(desFile);
			byte[] buf = new byte[1024];
			System.out.println("开始复制文件....");
			System.out.println("复制进度1%\n.....");
			while (fis.read(buf)!=-1) {
				fos.write(buf);
			}
			System.out.println("复制进度100%");
			System.out.println("文件复制成功！！！");
			fis.close();
			fos.close();
	}
}
