package Day13.Threads;

class Caller{
	public synchronized void call(String s) {
		//synchronized(this){
		System.out.print("Hello ");
		System.out.print(s+" ");
		System.out.println("Good morning");
	//}
	}
}
public class SyncDemo extends Thread{
	String name;
	Caller c;
	SyncDemo(Caller c,String s){
		this.name=s;
		this.c=c;
		this.start();
	}
	public void run(){
		c.call(name);
		
	}
	public static void main(String args[]) {
		Caller c=new Caller();
		SyncDemo t1=new SyncDemo(c,"Sai"); 
		//t1.start();
		SyncDemo t2=new SyncDemo(c,"Pranav");
		//t2.start();
	
	}

}
