package ch08;

public class Student {
	private int number;
	private String name;
	private int grade;
	
	public Student() {}
	
	public Student(int number, String name, int grade) {
		this.number = number;
		this.grade = grade;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void ShowStudentInfo() {
		System.out.println("학번은 " + number +"이고 이름은 " + name + "이며 학년은" + grade + "입니다.");
	}
}
