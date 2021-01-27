package com.pxy.lesson7_txl;

public class Schoolmate extends Friend implements IPWDManager {
	private String city;
	
	public Schoolmate(){}
	public Schoolmate(String name, String phone, String city){
		super(name, phone);
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public void encrypt() {
		// TODO Auto-generated method stub
		String newPhone = "";
		for (int i = 0; i < this.getPhone().length(); i++) {
			newPhone += (char)(this.getPhone().charAt(i)*2);
		}
		this.setPhone(newPhone);
	}
	@Override
	public void decode() {
		// TODO Auto-generated method stub
		String newPhone = "";
		for (int i = 0; i < this.getPhone().length(); i++) {
			newPhone += (char)(this.getPhone().charAt(i)/2);
		}
		this.setPhone(newPhone);
	}
	
	
}
