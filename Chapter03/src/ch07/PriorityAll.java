package ch07;

public class PriorityAll implements Scheduler{

	@Override
	public void getNextcall() {
		System.out.println("�켱������ ���� �� ������ ��⿭���� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("��� ���� ��ų�� ���� ������� �켱������ ����մϴ�.");
	}

}
