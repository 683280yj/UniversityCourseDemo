package test4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Interface {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
				System.out.println("��ӭʹ��*****��˾Ա������ϵͳ");
				System.out.println("========================");
				System.out.println("1.���");
				System.out.println("2.ɾ��");
				System.out.println("3.�鿴");
				System.out.println("4.�˳�");
				System.out.println("�����룺");
				int t = input.nextInt();
				switch (t) {
				case 1:
					add();
					break;
				case 2:
					delete();
					break;
				case 3:
					examine();
					break;
				default:
					System.out.println("���˳�");
					break;
				}		
	}	
		public static void  add(){
				System.out.println("ϵͳ����>���");
				System.out.println("-------------------------------------------");
				System.out.println("������������");
				Scanner input=new Scanner(System.in);
				String ename=input.next();
				System.out.println("�������Ա�");
				String sex=input.next();
				System.out.println("������н�ʣ�");
				String salary=input.next();
				System.out.println("�����벿�ţ�");
				String dptid=input.next();
				
				
				
		}
	
		public static void delete(){
				System.out.println("ϵͳ����>ɾ��");
				System.out.println("-------------------------------------------");
				System.out.println("�����빤�ţ�");
				Scanner input=new Scanner(System.in);
				String eid=input.next();
		}
	
		public static void examine(){
			Scanner input=new Scanner(System.in);
				System.out.println("ϵͳ����>�鿴");
				System.out.println("-------------------------------------------");
				System.out.println("1.��ѯ���У�");
				System.out.println("2.���ݲ��Ų�ѯ��");
				System.out.println("3.����������ѯ��");
				System.out.println("4.���ݹ��Ų�ѯ��");
				int s = input.nextInt();
				switch (s) {
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				default:
					System.out.println("�������");
					break;
				}		
			}	
		}

