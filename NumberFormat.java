package Exception;

public class NumberFormat {
	public static void main(String[]args) {
		String x=args[0];
		try {
		int y=Integer.parseInt(x);
		System.out.println(y);
		}
		catch(ArithmeticException ae) {
			System.out.println("You are giving the null value");
			ae.printStackTrace();
		}
		catch(NullPointerException npe) {
			System.out.println("You are giving the null value");
			npe.printStackTrace();
		}
		catch(NumberFormatException nfe) {
			System.out.println("You are giving the null value");
			nfe.printStackTrace();
		}
		
		
	}

}
