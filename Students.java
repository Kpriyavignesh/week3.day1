package week3.day1;

public class Students {
	
	public void getStudentInfo(int stuId) {
		System.out.println("Student Details with only ID");
		//System.out.println("______________________________");
		System.out.println("Student Id:"+" "+stuId);
		System.out.println("______________________________");
	}
	
	public void getStudentInfo(int stuID,String stuName) {
		System.out.println("Student Details with ID and Name");
		//System.out.println("______________________________");
		System.out.println("Student Id:"+" "+stuID);
		System.out.println("Student Name:"+" "+stuName);
		System.out.println("______________________________");
	}
	
	
	public void getStudentInfo(String stuEmail,long phoneNo) {
		System.out.println("Student Details with EMail and Phone Number");
		//System.out.println("______________________________");
		System.out.println("Student Email: "+stuEmail);
		System.out.println("student PhoneNumber: "+phoneNo);
		System.out.println("______________________________");
	}
	

	public static void main(String[] args) {
		Students students =new Students();
		students.getStudentInfo(1001);
		students.getStudentInfo(1002, "Kamalapriya");
		students.getStudentInfo("Priya@gmail.com", 9944583806L);
	}

}
