package test_2;

public class XCB extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println("开始洗第"+(i+1)+"个茶杯！");
				Thread.sleep(1500);
				System.out.println("第"+(i+1)+"个茶杯洗干净了！");
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace(); 
		}
	}
}
