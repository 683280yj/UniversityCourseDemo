package com.pxy.lesson6;

import com.pxy.lesson6.Car.CarType;

public class Test {

	public static void main(String[] args) {
		Automobile am = new Car("鄂A48298", CarType.宝马);
		
		am = new Bus("adfaf", 22);
		
		if(am instanceof Bus){
			System.out.println("有个"+((Bus)am).getSeatCount()+"座位");
		}
		else if(am instanceof Car){
			System.out.println(((Car)am).getType());
		}
		
	}

}
