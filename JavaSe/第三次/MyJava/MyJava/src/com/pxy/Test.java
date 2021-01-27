package com.pxy;

import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//DVD租赁系统
		//DVD类：编号，名称，出租时间，状态(是否已出借)
		//DV管理类：DVD列表（数组），添加()，删除()，修改()，查看所有DVD()，出租()，归还()
		//界面类：显示主界面(),显示添加界面().....
		Menu menu = new Menu();
		
		menu.mainMenu();
		
	}

}
