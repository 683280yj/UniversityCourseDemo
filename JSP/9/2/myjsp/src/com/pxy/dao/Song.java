package com.pxy.dao;

public class Song {
	private int songID;
	private String title;
	private String pingTitle;
	private int typeID;
	private int singerID;
	private int hit;
	private String url;
	
	public Song(){}
	public Song(int songID,String title,String pingTitle,int typeID,int singerID,int hit,String url){
		this.songID = songID;
		this.title = title;
		this.pingTitle = pingTitle;
		this.typeID = typeID;
		this.singerID = singerID;
		this.hit = hit;
		this.url = url;
	}
	
	public int getSongID() {
		return songID;
	}
	public void setSongID(int songID) {
		this.songID = songID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPingTitle() {
		return pingTitle;
	}
	public void setPingTitle(String pingTitle) {
		this.pingTitle = pingTitle;
	}
	public int getTypeID() {
		return typeID;
	}
	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
	public int getSingerID() {
		return singerID;
	}
	public void setSingerID(int singerID) {
		this.singerID = singerID;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
