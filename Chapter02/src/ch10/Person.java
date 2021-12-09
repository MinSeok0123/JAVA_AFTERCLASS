package ch10;

public class Person {
	
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1300);
		this.money -= 1300;
	}
	
	public void takeBus(Bus bus) {
		
		bus.take(200);
		this.money -= 200;
	}
	
	public void takeCar(Car car, GasStation suyeong) {
		this.money -= car.take(suyeong);
	}
	
	public void showInfo() {
		System.out.println(name + "´ÔÀÇ ³²Àº µ·Àº " + money + "¿ø ÀÔ´Ï´Ù");
	}

}
