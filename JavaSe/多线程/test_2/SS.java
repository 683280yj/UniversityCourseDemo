package test_2;

public class SS extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("开始烧水~");
			Thread.sleep(20000);
			System.out.println("水烧开了~");
		} catch (InterruptedException ie ) {
			ie.printStackTrace(); 
		}
	}
}
