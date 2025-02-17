package Day5.exceptions.assigntment1;

import java.util.Date;
import java.text.SimpleDateFormat;


public class Contact_class {
	String Fname,Mname,Lname;
	Date dob;
	char g;
	long num;
	public Contact_class(String fname, String mname, String lname, Date i, char g, long num) {
		super();
		Fname = fname;
		Mname = mname;
		Lname = lname;
		this.dob = i;
		this.g = g;
		this.num = num;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fdob = sdf.format(dob);
		return "Contact_class [Fname=" + Fname + ", Mname=" + Mname + ", Lname=" + Lname + ", dob=" + fdob + ", g=" + g
				+ ", num=" + num + "]";
	}
	

}
