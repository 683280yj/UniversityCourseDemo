package test;

import java.io.File;

public class wenj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				File file = new File("hyq.txt");
				
				System.out.println("�ļ���Ŀ¼�Ƿ����"+file.exists());
				System.out.println("���ļ���" + file.isFile());
			    System.out.println("��Ŀ¼��" + file.isDirectory());
			    System.out.println("���ƣ�" + file.getName());
			    System.out.println("����·����" + file.getAbsolutePath());
			    System.out.println("�ļ���С��" + file.length());
			    
	}

}
