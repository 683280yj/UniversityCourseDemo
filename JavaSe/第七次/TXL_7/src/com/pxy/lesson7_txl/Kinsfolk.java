package com.pxy.lesson7_txl;

public class Kinsfolk extends Friend {
	private String relation;
	
	public Kinsfolk(){}
	public Kinsfolk(String name, String phone, String relation){
		super(name, phone);
		this.relation = relation;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	
}
