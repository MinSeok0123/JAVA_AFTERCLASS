package ch10;

public class Bus {
	String number;
	int passengerCount;
	int money;
	
	public Bus(String number) {
		this.number = number;
		
	}
	
	public void take(int money) {
		this.money = money;
		this.passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(number + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}

}
