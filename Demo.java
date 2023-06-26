package Exception;

public class Demo {
	public static void main(String[]args) {
		System.out.println("Hai");
		int a=10;
		System.out.println(a);
		int b=20;
		int c=0;
		try {
		int x=a/b;
		System.out.println(x);
		int y=a/c;
		System.out.println(y);
		}
		catch(ArithmeticException ae) {
			System.out.println("Don't divide any number by zero");
			ae.printStackTrace();
		}
		System.out.println("Hello");
	}

}
