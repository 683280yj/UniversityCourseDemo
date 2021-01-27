package com.pxy.lesson9;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Ma> list = new ArrayList<Ma>();
		
		for (int i = 1; i <= 5; i++) {
			Ma ma = new Ma();
			ma.setName(i+"号马");
			list.add(ma);
		}
		
		for (Ma ma : list) {
			ma.start();
		}
	}

}
