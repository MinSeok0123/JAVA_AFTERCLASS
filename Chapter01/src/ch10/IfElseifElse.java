package ch10;

public class IfElseifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
		int charge;
		
		if(age<8) {
			System.out.println("�� ���� �Ƶ��Դϴ�.");
			charge = 200;
		}
		else if(age<14) {
			System.out.println("�ʵ��л��Դϴ�.");
			charge = 400;
		}
		else if(age<20) {
			System.out.println("�� ����Դϴ�.");
			charge = 800;
		}
		else {
			System.out.println("�����Դϴ�.");
			charge = 1200;
		}
		System.out.println("����� "+ charge + "�� �Դϴ�.");
	}

}
