package Java8;

public class UseStudents {
	public static void main(String[]args) {
		Students.collegeName="DSEC";
		Students s1=new Students();
		s1.name="Suresh";
		s1.age=20;
		s1.degree="Mech";
		s1.collegeName="HGF";
		Students s2=new Students();
		s2.name="Ram";
		s2.age=22;
		s2.degree="Civil";
		s2.collegeName="ABC";
		Students s3=new Students();
		s3.name="Madhan";
		s3.age=21;
		s3.degree="Mechatronics";
		s3.collegeName="jhg";
		System.out.println(s1.name+","+s1.age+s1.degree+s1.collegeName);
		System.out.println(s2.name+","+s2.age+s2.degree+s2.collegeName);
		System.out.println(s3.name+","+s3.age+s3.degree+s3.collegeName);
	}

}
