package ch01;

public class AnimalTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("choi");
		Tiger t1 = new Tiger("bat");
		
		p1.walk("두 발");
		t1.walk("네 발");
		
		p1.drive();
		t1.hunt();
		

	}

}
