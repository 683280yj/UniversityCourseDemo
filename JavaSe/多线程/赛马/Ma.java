package com.pxy.lesson9;

import java.util.Random;

public class Ma extends Thread {
	public static int ranking = 0;	//名次
	@Override
	public void run() {
		Random random  = new Random();
		int mileage = 0;
		
		try {
			while(true){
				mileage += 100+random.nextInt(100);
				System.out.println(this.getName()+"已经跑了"+mileage+"米！");
				if(mileage>=1000){
					System.out.println(this.getName()+"跑到终点了，他是第"+(++ranking)+"名！！！");
					break;
				}
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}
