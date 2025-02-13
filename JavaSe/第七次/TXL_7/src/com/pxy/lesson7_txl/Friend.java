package com.pxy.lesson7_txl;

public abstract class Friend {
	private String name;
	private String sex;
	private String phone;
	private String address;
	
	public Friend(){}
	public Friend(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	public Friend(String name,String phone, String sex, String address){
		this(name, phone);
		this.sex = sex;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
