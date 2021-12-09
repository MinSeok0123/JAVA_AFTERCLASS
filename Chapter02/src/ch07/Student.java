package ch07;

public class student {
	
	int number;
	String name;
	Subject Korean;
	Subject math;
	
	public student(String name, int number) {
		this.name = name;
		this.number = number;
		
		Korean = new Subject();
		math = new Subject();
	}
	
	public void setKoreanScore(int score) {
		Korean.score = score;
	}
	public void setMathScore(int score) {
		math.score = score;
	}
	public void setKoreanName(String name) {
		Korean.name = name;
	}
	public void setMathName(String name) {
		math.name = name;
	}
	
	public void showStudentScoreName() {
		int sum = Korean.score + math.score;
		String Kname = Korean.name;
		String Mname = math.name;
		System.out.println(name + "학생의 총점은 " + sum + "이고 국어과목코드는 " + Kname + ", 수학과목코드는 " + Mname + "입니다.");
	}

}
