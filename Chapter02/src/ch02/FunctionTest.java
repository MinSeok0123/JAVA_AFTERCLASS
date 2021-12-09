package ch02;

public class FunctionTest {
	//두 수를 입력받아 더한 결과 값을 반환하는 함수

	public static int add(int num1, int num2) {
		return (num1 + num2);
	}
	
	//이름을 입력받아 이름+hello를 출력하는 합수
	
	public static void sayHello(String name) {
		System.out.println(name + "hello");
	}
	
	//1부터 100까지 더한 결과값을 반환하는 함수
	
	public static int calcSum(int sum) {
		for(int i=1; i<=100; i++) {
			sum += i;
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		
		
		/*int num1 = 10;
		int num2 = 20;
		
		
		sum = add(num1, num2);
		
		sayHello("mrchoi");*/
		int sum = 0;
		
		calcSum(sum);
		
		

	}

}
