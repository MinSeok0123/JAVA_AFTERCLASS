package ch05;

public class Person {
	int renth;
	int weight;
	int gender;
	
	public Person(int renth, int weight, int gender) {
		this.renth = renth;
		this.weight = weight;
		this.gender = gender;
	}
	public void ShowPersonInfo() {
		System.out.println("키가 " +renth +"이고 몸무게가 " + weight + "kg인 남성이 있습니다. 이름은 mrchoi이고 나이는 " + gender + "입니다.");
	}

}
