package hyq_lx;

import java.util.Scanner;

public class lx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		int year;	
		int month;	
		System.out.print("请输入年份：");
		year = input.nextInt();
		System.out.print("请输入月份：");
		month = input.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println(year+"是闰年");
		}
		else{
			System.out.println(year+"是平年");
		}
		
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10: case 12:
			System.out.println(month+"月有31天");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println(month+"月有30天");
			break;
		case 2:
			if(year%4==0 && year%100!=0 || year%400==0){
				System.out.println(month+"月有29天");
			}
			else{
				System.out.println(month+"月有28天");
			}
			break;
		default:
			System.out.println("地球一年只有12个月！！");
			break;
	}
	}
}
