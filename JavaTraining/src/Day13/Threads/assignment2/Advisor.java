package Day13.Threads.assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Advisor extends Thread{
	List<String>l=Arrays.asList("Never begin to stop and never stop to begin.",
			 "Only destination isn’t important, one should enjoy the journey.",
			"impossible itself says ‘i m possible’");
	Random r=new Random();
	public void run() {
		System.out.println(l.get(r.nextInt(l.size())));
		
	}
	public static void main(String args[]) {
		
		Advisor t1=new Advisor();
		t1.start();
		Advisor t2=new Advisor();
		t2.start();
	}

}
