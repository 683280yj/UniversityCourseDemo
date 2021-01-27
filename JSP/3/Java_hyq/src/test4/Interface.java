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
		
				System.out.println("欢迎使用*****公司员工管理系统");
				System.out.println("========================");
				System.out.println("1.添加");
				System.out.println("2.删除");
				System.out.println("3.查看");
				System.out.println("4.退出");
				System.out.println("请输入：");
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
					System.out.println("已退出");
					break;
				}		
	}	
		public static void  add(){
				System.out.println("系统——>添加");
				System.out.println("-------------------------------------------");
				System.out.println("请输入姓名：");
				Scanner input=new Scanner(System.in);
				String ename=input.next();
				System.out.println("请输入性别：");
				String sex=input.next();
				System.out.println("请输入薪资：");
				String salary=input.next();
				System.out.println("请输入部门：");
				String dptid=input.next();
				
				
				
		}
	
		public static void delete(){
				System.out.println("系统——>删除");
				System.out.println("-------------------------------------------");
				System.out.println("请输入工号：");
				Scanner input=new Scanner(System.in);
				String eid=input.next();
		}
	
		public static void examine(){
			Scanner input=new Scanner(System.in);
				System.out.println("系统——>查看");
				System.out.println("-------------------------------------------");
				System.out.println("1.查询所有：");
				System.out.println("2.根据部门查询：");
				System.out.println("3.根据姓名查询：");
				System.out.println("4.根据工号查询：");
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
					System.out.println("输入错误");
					break;
				}		
			}	
		}

