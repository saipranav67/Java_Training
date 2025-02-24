package Day13.Threads.assignment3;

import java.text.SimpleDateFormat;
import java.util.Date;

class DigitalClock extends Thread {
    private SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            Date date = new Date();
            System.out.println("Current Time: " + formatter.format(date));
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Clock interrupted.");
                break;
            }
        }
    }
}

public class DigitalClockDemo {
    public static void main(String[] args) {
        DigitalClock clock = new DigitalClock();
        clock.start();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        clock.interrupt();
    }
}

