package test_2_shoupiao;

public class SellTicket implements Runnable {
	private int tickets = 20;

	private Object obj = new Object(); 
	public void run() {
	while (true) {
	synchronized (obj) {
	if (tickets > 0) {
	try {
	Thread.sleep(100);
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	System.out.println(Thread.currentThread().getName()
	+ "正在出售第" + (tickets--) + "张票");
			}
		            }
	                      }
	           }

}
