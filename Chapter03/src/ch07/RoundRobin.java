package ch07;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextcall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배정합니다.");
	}
	
	
}
