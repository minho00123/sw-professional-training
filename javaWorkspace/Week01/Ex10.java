class Ex10 {

	public static void main(String[] args) {
		/*
		 * 제어문
		 * 1. 조건문
		 * 1-2. switch문
		 * switch(값){
		 *     case 값: 실행문;break;
		 *     case 값: 실행문;break;
		 *     ...
		 *     default: 실행문;
		 * }
		 * 값의 자료형이 일치해야 한다.
		 * 값은 무조건 값으로 들어가야 한다. (조건이면 안된다.)
		 */
		 
		 int su = 1;
		 switch(su) {
			case 2:	System.out.print("이");break;
			case 1:	System.out.print("일");break;
			case 0:	System.out.print("영");break;
			case -1: System.out.print("음수 일");break;
			default: System.out.print("몰라");
		 }
		 
		 System.out.println("입니다.");
		 
		 //switch(su) {
		//	case 2:	System.out.print("이");break;
		//	case 1.0:	System.out.print("일");break; // 값의 자료형이 불일치
		//	case 0:	System.out.print("영");break;
		//	case -1: System.out.print("음수 일");break;
		//	default: System.out.print("몰라");
		 //}
		 
		 switch(su) {
			case 2: case 1:	System.out.print("양수");break;
			case 0:	System.out.print("영");break;
			case -1: System.out.print("음수 일");break;
			default: System.out.print("몰라");
		 }
		 
		 System.out.println("입니다.");
	}

}