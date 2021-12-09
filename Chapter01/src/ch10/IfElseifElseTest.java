package ch10;

public class IfElseifElseTest {

	public static void main(String[] args) {
		
		int age = 17;
		int charage;
		
		if(age<8) {
			System.out.println("미 취학 아동입니다.");
			charage = 200;
		}
		else if(age<14) {
			System.out.println("초등학생입니다.");
			charage = 400;
		}
		else if(age<20) {
			System.out.println("중 고딩입니다.");
			charage = 800;
		}
		else {
			System.out.println("성인입니다.");
			charage = 1200;
		}
		System.out.println("요금은 " + charage + "원 입니다.");

	}

}
