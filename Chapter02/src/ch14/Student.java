package ch14;

import java.util.ArrayList;

public class Student {
	
	private static int number = 1117;
	private int studentNumber;
	private String name;
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	public Student(String name) {
		this.name = name;
		this.studentNumber = number++;
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score);
		subjectList.add(subject);
		
	}
	
	public void showInfo() {
		System.out.println(name + "학생의 학번은 "+ studentNumber + "입니다.");
		for(Subject subject:subjectList) {
			System.out.println("수강한 과목의 이름은 "+ subject.getName() + "이 과목의 점수는 " + subject.getScore()+ "입니다.");
		}
	}
	
}
