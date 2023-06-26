package Java8;

public class UseMath {
	public static void main(String[]args) {
		Math add=(a,b) -> a+b;
		System.out.println(add.find(20,30));
		Math sub=(a,b)-> a-b;
		System.out.println(sub.find(50,30));
		Math multy=(a,b)->a*b;
		System.out.println(multy.find(50, 25));
		Math div=(a,b)->a/b;
		System.out.println(div.find(50, 5));
		
	}

}
