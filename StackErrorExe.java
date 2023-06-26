package Exception;

public class StackErrorExe {
	public void findA() {
		findB();
	}
	public void findB() {
		findA();
	}
	
	public static void main(String[]args) {
		StackErrorExe stack=new StackErrorExe();
		stack.findA();
	}

}
