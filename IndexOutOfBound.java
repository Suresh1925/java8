package Exception;

public class IndexOutOfBound {
	public static void main(String[]args) {
		String x=args[0];
		String y=args[1];
		System.out.println(x);
		try {
		String z=args[2];
		System.out.println(z.indexOf(1));
		}
		catch(IndexOutOfBoundsException b) {
			System.out.println(b);
			System.out.println("There is no value");
			b.printStackTrace();
		}
		finally {
			System.out.println("Hai");
		}
		System.out.println(y);
	}

}
