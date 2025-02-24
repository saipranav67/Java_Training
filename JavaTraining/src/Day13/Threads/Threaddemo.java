package Day13.Threads;

class Thread1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}
public class Threaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		Thread1 t1=new Thread1();
		t1.start();
		t1.setName("hello");
		Thread t2=new Thread1();
		t2.start();
		System.out.println(Thread.activeCount());
		
		try {
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After join method- "+Thread.activeCount());

	}

}
