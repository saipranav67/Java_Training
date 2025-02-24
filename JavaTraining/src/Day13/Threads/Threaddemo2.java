package Day13.Threads;

public class Threaddemo2 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[]) {
		Threaddemo2 t2=new Threaddemo2();
		Thread t1=new Thread(t2,"Child");
		t1.start();
		System.out.println(Thread.activeCount());
		
		
	}

}
