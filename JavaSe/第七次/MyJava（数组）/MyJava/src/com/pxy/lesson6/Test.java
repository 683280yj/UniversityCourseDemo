package com.pxy.lesson6;

import com.pxy.lesson6.Car.CarType;

public class Test {

	public static void main(String[] args) {
		Automobile car = new Car("鄂A48298", CarType.宝马);
		Bus bus = new Bus("京A48482", 28);
		
		System.out.println(car.toString());
	}

}
