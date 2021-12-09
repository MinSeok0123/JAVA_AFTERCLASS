package ch08;

public class StudentTest {
	public static void main(String[] args) {
	
		Student mrchoi = new Student(100, "mrchoi" , 1);
		Student kim = new Student(101, "kim", 2);
		
		kim.setName("gim");
		
		
		mrchoi.ShowStudentInfo();
	}
}
