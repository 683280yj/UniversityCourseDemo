package test_2;

public class XCB extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println("��ʼϴ��"+(i+1)+"���豭��");
				Thread.sleep(1500);
				System.out.println("��"+(i+1)+"���豭ϴ�ɾ��ˣ�");
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace(); 
		}
	}
}
