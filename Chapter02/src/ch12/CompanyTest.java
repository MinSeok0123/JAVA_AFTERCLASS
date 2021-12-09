package ch12;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company naver = Company.getInstance();
		Company kakao = Company.getInstance();
		
		System.out.println(naver);
		System.out.println(kakao);
	}

}
