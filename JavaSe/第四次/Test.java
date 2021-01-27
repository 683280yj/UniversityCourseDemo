package com.pxy;

import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Menu menu = new Menu();
//		menu.mainMenu();
		Scanner input = new Scanner(System.in);
		int y;			//年
		int m;			//月
		int days = 0;	//总天数
		int w;			//星期
		int m_days=0;	//输入月份的天数
		System.out.print("请输入年份：");
		y = input.nextInt();
		System.out.print("请输入月份：");
		m = input.nextInt();
		
		//1.求输入年月距离1900.1.1号有多少天
		//1.1 输入年份距离1900年有多少年（有多少天）
		for (int i = 1900; i < y; i++) {
			days += 365;
			if(i%4==0 && i%100!=0 || i%400==0){
				days += 1;
			}
		}
		//1.2 输入月份，距离输入年份的1月1号有多少天
		for (int i = 1; i < m; i++) {
			switch (i) {
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				days += 31;
				break;
			case 4:case 6:case 9:case 11:
				days += 30;
				break;
			case 2:
				days += 28;
				if(y%4==0 && y%100!=0 || y%400==0){
					days += 1;
				}
				break;
			default:
				break;
			}
		}
		//2.求输入年月的1号是星期几？
		w = (days+1)%7;
		//3.显示
		switch (m) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			m_days = 31;
			break;
		case 4:case 6:case 9:case 11:
			m_days = 30;
			break;
		case 2:
			m_days = 28;
			if(y%4==0 && y%100!=0 || y%400==0){
				m_days += 1;
			}
			break;
		}
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for (int i = 0; i < w; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= m_days; i++) {
			System.out.print(i+"\t");
			if((w+i)%7==0){
				System.out.println();
			}
		}
		
	}
}
