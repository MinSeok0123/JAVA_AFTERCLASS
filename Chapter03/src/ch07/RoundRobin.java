package ch07;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextcall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� �����մϴ�.");
	}
	
	
}
