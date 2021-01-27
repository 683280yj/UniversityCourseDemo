package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class wenj_1 {

	public static void main(String[] args) {
		try{
		// TODO Auto-generated method stub
			File file =new File("hyq.txt");
			
			FileInputStream fis = new FileInputStream(file);
			for(int i = 0; i < file.length(); i++){
				char ch = (char)(fis.read()); 
		        System.out.print(ch);
			}
			System.out.println();
		      fis.close();     
		}catch (FileNotFoundException fnfe) {
		      System.out.println("文件打开失败。");
	}catch (IOException ioe) {
	      ioe.printStackTrace();
}}}
