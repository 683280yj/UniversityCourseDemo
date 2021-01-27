package test_1;								

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try{
					DVD dvd = new DVD();
					
					File file = new  File("d:\\hyq.data");
					FileInputStream fis = new FileInputStream(file);
					ObjectInputStream ois = new ObjectInputStream(fis);
					
					dvd = (DVD)ois.readObject();
					
					ois.close();
					fis.close();
					
					System.out.println(dvd.getName());
					
				}
				catch (Exception e)
				{
					// TODO: handle exception
					System.out.println(e.getMessage());
				}			
        }
}