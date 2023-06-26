package Java8;

public class UseMaths {
	public static void main(String[]args) {
		int[] nums= {34,65,67,89,32,73,98};
		Arith a=new Arith();
		Maths max=a::findMax;
		Maths min=a::findMin;
		System.out.println(max.find(nums));
		System.out.println(min.find(nums));
		
	}

}
