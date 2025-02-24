package Day13.Threads.assignment1;
class booking{
	static boolean avail=true;
	public synchronized void ConferenceRoomBookingJob() {
		if(Availability()) {
			System.out.println("booking");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Meeting in progress....");
			System.out.println("Meeting done..");
		}
		
	}
	public boolean Availability(){
		return avail;
		
	}
}
public class Manager extends Thread{
	booking b;
	Manager(booking b){
		this.b=b;
		this.start();
		
	}
	public void run() {
		b.ConferenceRoomBookingJob();
		
	}
	public static void main(String args[]) {
		booking b=new booking();
		Manager m1=new Manager(b);
		Manager m2 =new Manager(b);
		
		
	}

}
