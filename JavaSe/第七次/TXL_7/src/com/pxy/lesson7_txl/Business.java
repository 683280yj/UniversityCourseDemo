package com.pxy.lesson7_txl;

public class Business extends Friend {
	private String type;
	
	public Business(){}
	public Business(String name, String phone, String type){
		super(name, phone);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
