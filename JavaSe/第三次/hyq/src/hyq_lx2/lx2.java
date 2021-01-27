package hyq_lx2;

public class lx2 {
	public static void main( String[] args) {
		for (int i = 100; i < 1000; i++) {
			int g = i%10;
			int s = i/10%10;
			int b = i/100;
			if(i==g*g*g+s*s*s+b*b*b){
				System.out.println(i+"是水仙花数！");
			}
		}
	}
}
