package com.pxy;

import java.util.Date;

public class DVDManager {
	private DVD[] dvdList = new DVD[50];	//DVD列表
	
	public DVDManager(){
		dvdList[0] = new DVD();
		dvdList[0].setNo("9527");
		dvdList[0].setName("监狱风云2");
		dvdList[0].setState(1);
		dvdList[0].setOutDate(new Date());
	}
	
	//	添加()
	//格式：访问修饰符 返回值类型 方法名(参数列表){}
	public int add(DVD dvd){
		int state = 0;	//0. 添加失败 1.成功
		for (int i = 0; i < dvdList.length; i++) {
			if(dvdList[i]==null){
				dvdList[i] = dvd;
				state = 1;
				break;
			}
		}
		
		return state;
	}
	//查看所有DVD()
	public void showAll(){
		System.out.println("序号\t名称\t状态\t借出时间");
		for (int i = 0; i < dvdList.length; i++) {
			if(dvdList[i]!=null){
				System.out.println(dvdList[i].getNo()+"\t"+
						dvdList[i].getName()+"\t"+
						(dvdList[i].getState()==0?"可借":"已借出")+"\t"+
						(dvdList[i].getOutDate()==null?"":dvdList[i].getOutDate()));
			}
			
		}
	}
	
	//，删除()，修改()，出租()，归还()
}
