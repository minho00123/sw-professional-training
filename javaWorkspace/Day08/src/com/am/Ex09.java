package com.am;

public class Ex09 {
	// 다형성
	public static void main(String[] args) {
		Carriage car1=new Carriage();
		Cycle car3=new Cycle();
//		car3.show();
		Car car2=new Car("흰색", "모닝");
		car1.speedUp();
		car1.show();
//		car1.stop();
		car2.speedUp();
		car2.show();
		car2.stop();
		Object obj=new String();
		Carriage car4;
		car4=new Car("검정색","자식");
		car4.speedUp();
		car4.show();
//		car4.stop();
		((Car)car4).stop();
		// 오버라이드의 대상은 메서드만
		System.out.println(car4.max);
		
	}

}
