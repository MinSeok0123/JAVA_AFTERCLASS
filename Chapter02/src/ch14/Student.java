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
		System.out.println(name + "�л��� �й��� "+ studentNumber + "�Դϴ�.");
		for(Subject subject:subjectList) {
			System.out.println("������ ������ �̸��� "+ subject.getName() + "�� ������ ������ " + subject.getScore()+ "�Դϴ�.");
		}
	}
	
}
