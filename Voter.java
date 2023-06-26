package Exception;

public class Voter {
	public static void main(String[]args) throws AgeException,Exception {
		
		int age=Integer.parseInt(args[0]);
		try {
		if(age>18) {
			System.out.println("Eligible to vote");
		}
		else {
			throw new AgeException("You are not eligible to apply");
		}
		}
		catch(AgeException ag) {
			System.out.println("Your age is Below the required level");
			ag.printStackTrace();
		}
		
	}

}
