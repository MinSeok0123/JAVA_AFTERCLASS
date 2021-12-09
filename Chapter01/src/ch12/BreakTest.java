package ch12;

public class breakTest {

	public static void main(String[] args) {
		
		int sum=0;
		int count;
		
		for(count =1; ; count++) {
			sum = sum + count;
			if(sum>=100) break;
		}
		System.out.println(sum);
		System.out.println(count);
	}

}
