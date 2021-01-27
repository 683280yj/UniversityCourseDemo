package com.pxy;

import java.util.Scanner;

public class Menu {
	
	private Scanner input = new Scanner(System.in);
	private DVDManager dvdManager = new DVDManager();
	
	public void mainMenu(){
		System.out.println("====欢迎使用DVD管理系统====");
		System.out.println("============================");
		System.out.println("1.添加");
		System.out.println("2.查看所有");
		System.out.println("3.退出");
		System.out.print("请选择：");
		int t = input.nextInt();
		switch (t) {
		case 1:
			addMenu();
			break;
		case 2:
			showAllMenu();
			break;
		default:
			System.out.println("欢迎下次再来！");
			break;
		}
	}

	private void returnMainMenu() {
		System.out.println("按任意键后回车返回...");
		input.next();
		mainMenu();
	}
	
	public void addMenu(){
		DVD dvd = new DVD();
		System.out.println("====系统->添加DVD====");
		System.out.println("--------------------------");
		System.out.print("请输入编号：");
		dvd.setNo(input.next());
		System.out.print("请输入名称：");
		dvd.setName(input.next());
		
		dvdManager.add(dvd);
		System.out.println("添加成功！");
		
		returnMainMenu();
	}

	
	public void showAllMenu(){
		System.out.println("====系统->查看所有DVD====");
		System.out.println("--------------------------");
		dvdManager.showAll();
		
		returnMainMenu();
		
	}
}
