package com.pxy.entity;

public class Singer {
	private int singerID;
	private String singerName;
	
	public Singer(){}
	public Singer(int singerID, String singerName){
		this.singerID = singerID;
		this.singerName = singerName;
	}
	
	public int getSingerID() {
		return singerID;
	}
	public void setSingerID(int singerID) {
		this.singerID = singerID;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	
	
}
