package test_2;

public class SS extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("��ʼ��ˮ~");
			Thread.sleep(20000);
			System.out.println("ˮ�տ���~");
		} catch (InterruptedException ie ) {
			ie.printStackTrace(); 
		}
	}
}
