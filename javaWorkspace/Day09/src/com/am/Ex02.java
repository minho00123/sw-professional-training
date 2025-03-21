package com.am;

// 1. 상속을 통해서만 사용하도록 강제
abstract class Machine{
	public void on() {System.out.println("켜다");}
	public void off() {System.out.println("끄다");}
	public abstract void work();
}

// 2. 특정 메서드의 오버라이드를 강제
class Audio extends Machine{
	@Override
	public void work() {

	}
}

class Tv extends Machine{
	@Override
	public void work() {
		System.out.println("화면을 보여주다");
	}
}
class Radio extends Machine{
	@Override
	public void work() {
		System.out.println("소리를 들려주다");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Machine remote=new Radio();
		remote.on();
		remote.work();
		remote.off();
	}

}
