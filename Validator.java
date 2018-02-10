
public class Validator {
	
	public static int case1(String password) {
		int passtime=0;
		
		if(password == null || password.isEmpty()) {
			return 0;
		}
		
		else if(! password.equalsIgnoreCase("password")) {
			passtime++;
		}
			
		else if(password.length() >= 8 ) {
			passtime++;
		}

		return passtime;	
	}
	
}
