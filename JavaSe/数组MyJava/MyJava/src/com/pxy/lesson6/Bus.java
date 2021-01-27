package com.pxy.lesson6;

public class Bus extends Automobile {
	private int seatCount;		//座位数量

	public Bus(String number,int seatCount){
		super(number);
		this.seatCount = seatCount;
	}
	
	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
	@Override
	public int calcRent(int days) {
		int price = 0;
		
		if(this.seatCount<=16){
			price = 800*days;
		}
		else{
			price = 1500*days;
		}
		
		return price;
	}
}
