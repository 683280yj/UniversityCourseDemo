package hyq_lx;

import java.util.Scanner;

public class lx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		int year;	
		int month;	
		System.out.print("��������ݣ�");
		year = input.nextInt();
		System.out.print("�������·ݣ�");
		month = input.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println(year+"������");
		}
		else{
			System.out.println(year+"��ƽ��");
		}
		
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10: case 12:
			System.out.println(month+"����31��");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println(month+"����30��");
			break;
		case 2:
			if(year%4==0 && year%100!=0 || year%400==0){
				System.out.println(month+"����29��");
			}
			else{
				System.out.println(month+"����28��");
			}
			break;
		default:
			System.out.println("����һ��ֻ��12���£���");
			break;
	}
	}
}
