package hyq;

import java.util.Scanner;

public class Menu {
	private Scanner input = new Scanner(System.in);
	
	private DVDManager dvdManager = new DVDManager();
	
	public void mainMenu(){
		System.out.println("====��ӭʹ��DVD����ϵͳ====");
		System.out.println("============================");
		System.out.println("1.���");
		System.out.println("2.ɾ��");
		System.out.println("3.�鿴����");
		System.out.println("4.�˳�");
		System.out.print("��ѡ��");
		int t = input.nextInt();
		switch (t) {
		case 1:
			addMenu();
			break;
		case 2:
			removeMenu();
		case 3:
			showAllMenu();
			break;
		default:
			System.out.println("��ӭ�´�������");
			break;
		}
	}

	private void returnMainMenu() {
		System.out.println("���������س�����...");
		input.next();
		mainMenu();
	}
	
	public void addMenu(){
		DVD dvd = new DVD();
		System.out.println("====ϵͳ->���DVD====");
		System.out.println("--------------------------");
		System.out.print("�������ţ�");
		dvd.setNo(input.next());
		System.out.print("���������ƣ�");
		dvd.setName(input.next());
		
		dvdManager.add(dvd);
		System.out.println("��ӳɹ���");
		
		returnMainMenu();
	}

	public void removeMenu(){
		System.out.println("====ϵͳ->ɾ��DVD====");
		System.out.println("--------------------------");
		System.out.print("�������ţ�");
		String no = input.next();
		
		int state = dvdManager.remove(no);
		if(state==1){
			System.out.println("ɾ���ɹ���");
		}
		else if(state == 0){
			System.out.println("���޴�Ƭ�������ԣ�");
		}
		else if(state == 2){
			System.out.println("�ѽ��DVD������ɾ����");
		}
		
		returnMainMenu();
	}
	
	public void showAllMenu(){
		System.out.println("====ϵͳ->�鿴����DVD====");
		System.out.println("--------------------------");
		dvdManager.showAll();
		
		returnMainMenu();
		
	}
}
