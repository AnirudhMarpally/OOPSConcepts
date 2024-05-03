package student;

public class Students {
	private int rollNo;
	private String studentName;
	private static int subject1;
	private static int subject2;
	private static int subject3;

	

public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getSubject1() {
		return subject1;
	}
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}
	public int getSubject2() {
		return subject2;
	}
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}
	public int getSubject3() {
		return subject3;
	}
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}
	
	
	
public Students(int rollNo, String studentName, int subject1, int subject2, int subject3) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}




public Students() {
	super();
}




@Override
public String toString() {
	return "StudentDetails [rollNo=" + rollNo + ", studentName=" + studentName + ", subject1=" + subject1
			+ ", subject2=" + subject2 + ", subject3=" + subject3 + "]";
}

public static double calPercentage() {
	double percent = ((subject1+subject2+subject3)/3);
	return percent;
}
}

