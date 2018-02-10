package csci3130;


public class Validator {
	
	public static int case1(String password) {
		int passtime=0;
		
		if(password == null || password.isEmpty()) {
			return 0;
		}
		//not password
		if(! password.equalsIgnoreCase("password")) {
			passtime++;
		}
		//longer than 8	
	    if(password.length() >= 8 ) {
			passtime++;
		}
	    //requiring at least 1 special character
	    if(!password.matches("[a-zA-Z0-9 ]*")) {
	    		passtime++;
	    }
	    //at least 1 digit
	    if(password.matches(".*\\d.*")) {
	    	  	passtime++;
	    }
	    //both upper and lower case
	    if(!password.equals(password.toLowerCase()) && !password.equals(password.toUpperCase())) {
	    		passtime++;
	    }
	    

		return passtime;	
	}
	
}
