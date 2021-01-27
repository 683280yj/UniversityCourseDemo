package com.pxy.lesson6;

/**
 * 汽车类
 */
public abstract class Automobile {
	private String number;		//车牌号
	
	public Automobile(){}
	public Automobile(String number){
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	//计算租金
	public abstract int calcRent(int days);
}
