package com.pxy.lesson7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String str = "hello,382";
		str = encrypt(str);
		System.out.println(str);
		str = decode(str);
		System.out.println(str);
	}

	public static String encrypt(String str){
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			s += (char)(c+6);
		}
		
		return s;
	}
	
	public static String decode(String str){
		String s = "";
		
		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			s += (char)(c-6);
		}
		
		return s;
	}
}

