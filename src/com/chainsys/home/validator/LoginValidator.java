package com.chainsys.home.validator;
import java.util.regex.*;

import com.chainsys.home.model.Register;

public class LoginValidator {
	public void loginValidator(Register register) throws Exception {
		if (register.getEmail().equals(null)) {
			throw new Exception("invalid email id");
		}
		if (register.getPassword() == "null") {
			throw new Exception("Invalid Password");
		}
}
	
	
	
		public  boolean mobileValid(String s) 
	    { 
	        // The given argument to compile() method  
	        // is regular expression. With the help of  
	        // regular expression we can validate mobile 
	        // number.  
	        // 1) Begins with 0 or 91 
	        // 2) Then contains 7 or 8 or 9. 
	        // 3) Then contains 9 digits 
			String value = null;
	        Pattern p = Pattern.compile("(0/91)?[6-9][0-9]{9}"); 
	  
	        // Pattern class contains matcher() method 
	        // to find matching between given number  
	        // and regular expression 
	        Matcher m = p.matcher(s); 
	        boolean status=(m.find() && m.group().equals(s)); 
	       if(!status)
	       {
	     
	    	 return false;
	       }
	       else
	       {
	    	   return true;
	       }
	       
	    	 
		
	    } 
	}
