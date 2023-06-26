package Exception;

public class NullPointExe {
public static void main(String[]args) {
	String x=null;
	try {
		String y=x.toUpperCase();
		System.out.println(y);
	}
	catch(ArithmeticException ae) {
		System.out.println("can't take null value in String");
	ae.printStackTrace();
	}
	catch(NullPointerException npe) {
		
		System.out.println("Can't take null value in String");
	npe.printStackTrace();
	}
	catch(Exception e) {
		System.out.println("can't take null value in String");
	}
	String z="Suresh";
	System.out.println(z);
}

}
