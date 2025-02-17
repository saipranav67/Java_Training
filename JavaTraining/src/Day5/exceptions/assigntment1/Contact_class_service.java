package Day5.exceptions.assigntment1;
import Day5.exceptions.assigntment1.except.*;

import java.util.Date;
import java.util.Stack;

public class Contact_class_service{
	public void validatePush(Stack<Contact_class> c,int size) throws sizeOverFlow{
		if(size>=5) {
			throw new except.sizeOverFlow();
			
			
		}
	}
	public void validatePop(int top) throws underFlow{
		if(top<0){
			throw new except.underFlow();
			
		}
		
	}
	public void validateInfo(String fname,String mname,String lname,Date dob,char g,Long ph) throws incorrectInfo{
		 if (!Character.isUpperCase(fname.charAt(0))) {
		        throw new incorrectInfo("First name must start with a capital letter.");
		    }
		    if (!Character.isUpperCase(lname.charAt(0))) {
		        throw new incorrectInfo("Last name must start with a capital letter.");
		    }
		    
		    Date today = new Date();
		    if (dob.after(today)) {
		        throw new incorrectInfo("Date of birth must be before today.");
		    }
		    
		    if (g != 'M' && g != 'F') {
		        throw new incorrectInfo("Gender must be 'M' or 'F'.");
		    }
		    
		    String phoneStr = String.valueOf(ph);
		    if (phoneStr.length() != 10) {
		        throw new incorrectInfo("Phone number must be exactly 10 digits.");
		    }
		
	}

}
