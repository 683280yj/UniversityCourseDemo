package com.pxy.lesson7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		Set list = new HashSet();
		
		list.add("刘备");
		list.add("关羽");
		list.add("张飞");
		list.add(23);
		list.add("刘备");
		list.add(true);
		
		list.remove(23);
		
		for (Object object : list) {
			System.out.println(object);
		}
		
//		List list = new ArrayList();
//		
//		list.add("刘备");
//		list.add("关羽");
//		list.add("张飞");
//		list.add("刘备");
//		
////		list.remove(2);
////		list.remove("关羽");
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
	}

}
