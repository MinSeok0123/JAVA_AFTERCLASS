package ch14;

public class StudentTest {

	public static void main(String[] args) {
		
		Student choi = new Student("choi");
		Student kim = new Student("kim");
		
		choi.addSubject("OS", 100);
		choi.addSubject("Math", 100);
		
		kim.addSubject("OS", 95);
		kim.addSubject("Math", 85);
		kim.addSubject("English", 90);
		
		choi.showInfo();
		kim.showInfo();

	}

}
