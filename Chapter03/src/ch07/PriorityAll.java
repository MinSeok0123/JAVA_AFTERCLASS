package ch07;

public class PriorityAll implements Scheduler{

	@Override
	public void getNextcall() {
		System.out.println("우선순위가 높은 고객 순으로 대기열에서 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담 업무 스킬이 높은 사람에게 우선적으로 배분합니다.");
	}

}
