package Exception;

public class Login{
	public static void main(String[]args)throws LoginException,Exception {
		String userName=args[0];
		String password=args[1];
		if(userName.equals("Suresh")&&password.equals("Suresh@1925")) {
			System.out.println("Login Success");
		}
		else {
			throw new LoginException("Invalid Credintials");
		}
		
		
	}

}
