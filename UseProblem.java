package Java8;

public class UseProblem {
	public static void main(String[]args) {
	
		Problem x=(a,b)->a+b;
		System.out.println(x.findNetPrice(15000,2500));
		Problem y=(a,b)->a+(a*b/100);
		System.out.println(y.findNetPrice(50000,25));
	
		
	}

}
