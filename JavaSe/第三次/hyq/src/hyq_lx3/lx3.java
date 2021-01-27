package hyq_lx3;

import java.util.Scanner;

public class lx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lx3 = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int n = lx3.nextInt();
		System.out.print(n+"=");
		for(int k=2;k<=n;k++) {
			while(n!=k) {
				if(n%k==0) {
					System.out.print(k+"*");
					n=n/k;
				}else{
					break;
				}
			}
		}
		System.out.println(n);
	}

}
