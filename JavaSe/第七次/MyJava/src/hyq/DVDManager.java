package hyq;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DVDManager {
private List dvdList = new ArrayList();	//DVD�б�
	
	public DVDManager(){
		
		DVD d1 = new DVD();
		d1.setNo("9527");
		d1.setName("��������2");
		d1.setState(1);
		d1.setOutDate(new Date());
		
		DVD d2 = new DVD();
		d2.setNo("3432");
		d2.setName("����������");
		
		DVD d3 = new DVD();
		d3.setNo("6655");
		d3.setName("�й�����");
		
		dvdList.add(d1);
		dvdList.add(d2);
		dvdList.add(d3);
	}
	
	//	���()
	//��ʽ���������η� ����ֵ���� ������(�����б�){}
	public void add(DVD dvd){
		dvdList.add(dvd);
	}
	//�鿴����DVD()
	public void showAll(){
		System.out.println("���\t����\t״̬\t���ʱ��");
		for (Object obj : dvdList) {
			DVD dvd = (DVD)obj;
			System.out.println(dvd.getNo()+"\t"+
					dvd.getName()+"\t"+
					(dvd.getState()==0?"�ɽ�":"�ѽ��")+"\t"+
					(dvd.getOutDate()==null?"":dvd.getOutDate()));
		}
		
	}
	
	//��ɾ��()
	public int remove(String dvdNO){
		int state = 0;	//0. û������ 1.ɾ���ɹ� 2.�ѽ������ɾ��
		for (Object obj : dvdList) {
			DVD dvd = (DVD)obj;
			if(dvd.getNo().equals(dvdNO) && dvd.getState()==0){
				dvdList.remove(dvd);
				state = 1;
				break;
			}
			else if(dvd.getNo().equals(dvdNO) && dvd.getState()==1){
				state = 2;
				break;
			}
		}
		
		return state;
	}
	

}
