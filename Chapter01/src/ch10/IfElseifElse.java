package ch10;

public class IfElseifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
		int charge;
		
		if(age<8) {
			System.out.println("미 취학 아동입니다.");
			charge = 200;
		}
		else if(age<14) {
			System.out.println("초등학생입니다.");
			charge = 400;
		}
		else if(age<20) {
			System.out.println("중 고딩입니다.");
			charge = 800;
		}
		else {
			System.out.println("성인입니다.");
			charge = 1200;
		}
		System.out.println("요금은 "+ charge + "원 입니다.");
	}

}
