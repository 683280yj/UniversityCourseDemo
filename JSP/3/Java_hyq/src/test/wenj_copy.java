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
			System.out.println("��ʼ�����ļ�....");
			System.out.println("���ƽ���1%\n.....");
			while (fis.read(buf)!=-1) {
				fos.write(buf);
			}
			System.out.println("���ƽ���100%");
			System.out.println("�ļ����Ƴɹ�������");
			fis.close();
			fos.close();
	}
}
