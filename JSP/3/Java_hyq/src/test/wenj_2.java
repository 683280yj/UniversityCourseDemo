package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class wenj_2 {
	public static void main(String[] args) throws IOException
	{
		String str = "I Love You to ";
		File file = new File("hyq.txt");
		FileOutputStream fos = new FileOutputStream(file,true);
		for (int i = 0; i < str.length(); i++) {
			fos.write(str.charAt(i));
		}
				fos.close();
	}
}
