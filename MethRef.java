package Java8;

public class MethRef {
	public int p1(int a,int b) {
		return a+b;
	}
	public int p2(int a,int b) {
		return a+(a*b/100);
	}
public void getEven(int[] a) {
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			System.out.println(a[i]);
		}
	}
	}
	public void upperCase(String name) {
			System.out.println(name.toUpperCase());
		}
	public void minString(String[] names) {
		 String temp=names[0];
		for(int i=0;i<names.length;i++) {
			if(names[i].length()<temp.length()) {
				temp=names[i];
			}
		}
		System.out.println(temp);
	}

}

