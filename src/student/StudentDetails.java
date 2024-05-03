package student;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students(1000,"anirudh",90,80,78);
		Students s2 = new Students(1001,"karthik",80,80,60);
		Students s3 = new Students(1002,"nithin",90,80,99);
		Students s4 = new Students(1003,"siri",90,80,78);
		Students s5 = new Students(1004,"sandhya",90,80,78);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println("percatages of students is" + s1.calPercentage()+" " + s2.calPercentage() +s3.calPercentage()+ s4.calPercentage()+s5.calPercentage());
		
	}

}
