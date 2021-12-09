package ch07;

public class StudentTest {

	public static void main(String[] args) {
		
		student choi = new student("choi", 100);
		student kim = new student("kim", 101);
		
		choi.setKoreanScore(100);
		choi.setMathScore(100);
		choi.setKoreanName("1q2w");
		choi.setMathName("3e4r");
		
		
		kim.setKoreanScore(90);
		kim.setMathScore(80);
		kim.setKoreanName("5t6y");
		kim.setMathName("7u8i");
		
		choi.showStudentScoreName();
		kim.showStudentScoreName();

	}

}
