package ch06;

public class Order {
	String jebsu;
	String phonenum;
	String juso;
	String day;
	String time;
	String gageak;
	String name;
	String num;
	
	public Order(String jebsu, String phonenum, String juso, String day, String time, String gageak, String name, String num  ) {
		this.jebsu = jebsu;
		this.phonenum = phonenum;
		this.juso = juso;
		this.day = day;
		this.time = time;
		this.gageak = gageak;
		this.name = name;
		this.num = num;
	}
	public void showOrderinfo() {
		System.out.println("주문 접수 번호: " + jebsu + "\n" +
							"주문 핸드폰 번호: " + phonenum + "\n" +
							"주문 집 주소: " + juso + "\n" +
							"주문 날짜: "+ day + "\n" +
							"주문 시간: " + time + "\n" +
							"주문 가격: " + gageak + "\n" +
							"메뉴 이름: " + name + "\n" +
							"메뉴 번호: " + num);
	}

}


