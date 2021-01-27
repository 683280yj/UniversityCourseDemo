package test;

import java.io.FileOutputStream;

public class wenj_3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
			String str = "I Love You";
			FileOutputStream fos= new FileOutputStream("hyq.txt");
			byte[] buffer = str.getBytes();
			fos.write(buffer);
			fos.close();
	}

}
