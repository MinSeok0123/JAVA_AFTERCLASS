package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer choi = new Customer("choi");
		System.out.println("1000원짜리 물품 구매 : " + choi.calcPrice(1000)+"원 지불");
		choi.showCustomerInfo();
		
		VIPCustomer kim = new VIPCustomer("kim");
		System.out.println("1000원짜리 물품 구매 :" + kim.calcPrice(1000)+"원 지불");
		kim.showCustomerInfo();

	}

}
