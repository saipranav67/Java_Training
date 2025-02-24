package Day13.Threads;

public class Threaddemo3 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	public static void main(String args[]) {
		Threaddemo3 t1=new Threaddemo3();
		t1.start();

		for(int i=0;i<5;i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
