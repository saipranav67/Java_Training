package Day5.exceptions.assigntment1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;

import Day5.exceptions.assigntment1.except.incorrectInfo;
import Day5.exceptions.assigntment1.except.sizeOverFlow;
import Day5.exceptions.assigntment1.except.underFlow;

public class Contact_class_test {

	public static void main(String[] args) throws ParseException,sizeOverFlow, underFlow, incorrectInfo {
		Stack<Contact_class> c=new Stack<>();
		int size=0;
		Contact_class_service cs=new Contact_class_service();
		int top=-1;
		int i=1;
		Scanner in=new Scanner(System.in);
		while(i!=-1) {
			String str="""
1.press One for push
2.press two for pop
3.press three for whole db.
4.press -1 to exit
					""";
			System.out.println(str);
			i=in.nextInt();
			
			switch(i) {
			case 1:
				cs.validatePush(c,size);
				System.out.println("First name");
				String fn=in.next();
				System.out.println("Middle name");
				String mn=in.next();
				System.out.println("Last name");
				String ln=in.next();
				System.out.println("date of birth in dd/mm/yyyy");
				String d_ob=in.next();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		        Date dob = sdf.parse(d_ob);
				System.out.println("gender");
				char g=in.next().charAt(0);
				System.out.println("phone number");
				long ph=in.nextLong();
				in.nextLine();
				cs.validateInfo(fn,mn,ln,dob,g,ph);
				c.push(new Contact_class(fn,mn,ln,dob,g,ph));
				size++;
				top++;
				break;
			case 2:
				cs.validatePop(top);
				break;
			case 3:
				System.out.println(c.toString());
				
	
			}
		}

		

	}

}
