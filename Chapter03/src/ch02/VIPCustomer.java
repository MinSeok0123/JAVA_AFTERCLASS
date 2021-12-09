package ch02;

public class VIPCustomer extends Customer{
	private double salesRatio;
	private int agentID;
	
	public VIPCustomer(String name) {
		super(name);
		super.customerName = name;
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		super.customerID = super.number++;
		this.salesRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price-(int)(price*salesRatio);
	}

}
