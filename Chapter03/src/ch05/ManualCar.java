package ch05;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("±â¾îºÀÀ» P->D");
		System.out.println("¿¢¼¿À» ¹à´Â´Ù");	
		System.out.println("ÇÚµéÀ» Á¶ÇâÇÑ´Ù.");
	}

	@Override
	public void stop() {
		System.out.println("ºê·¹ÀÌÅ©¸¦ ¹â´Â´Ù.");		
		System.out.println("±â¾îºÀÀ» D->P");
	}

}