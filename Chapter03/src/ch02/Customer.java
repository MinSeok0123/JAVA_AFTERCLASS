package ch02;

public class Customer {
	

	
	protected static int number = 100;
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	public Customer(String name) {
		customerName = name;
		customerGrade = "SILVER";
		customerID = number++;
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public void showCustomerInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며, 보너스 적립률은" + bonusRatio*100 + "%이고, 보너스 포인트는 " + bonusPoint + "점입니다.");
	}
	

}
