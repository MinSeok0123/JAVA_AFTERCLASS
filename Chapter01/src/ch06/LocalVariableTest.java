package ch06;

public class LocalVariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var i = 10;
		var j = 10.1;
		var str = "hello world";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = i + "20";
		System.out.println(str);
	}

}
