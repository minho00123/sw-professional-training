/*
Q1. 1~20까지 중 홀수를 출력하시오.
Q2. 1~50중 5의 배수만을 출력하시오.
Q3. 1~50의 합계를 구하시오.
Q4. 다음을 출력하시오.
		2+4+6+8+10=???
Q5. 구구단을 출력하시오(포멧은 그림대로)
*/



class Ex14 {

	public static void main(String[] args) {
		System.out.println("Q1.");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		System.out.println("----------------------");
		
		System.out.println("Q2.");
		for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("----------------------");
		
		System.out.println("Q3.");
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("----------------------");
		
		System.out.println("Q4.");
		int evenSum = 0;
		for (int i = 2; i <= 10; i += 2) {
			evenSum += i;
		}
		System.out.println("2+4+6+8+10="+evenSum);
		
		System.out.println("----------------------");
		
		System.out.println("Q5.");
		for (int dan = 2; dan <= 9; dan++) {
			System.out.print(dan+"단    ");
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan+"X"+i+"="+(dan*i)+"  ");
			}
			System.out.println();
		}
		
		System.out.println("----------강사님 답---------");
		System.out.println("Q1.");
		for(int i=1; i<=20; i++) {
			if(i%2!=0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		for(int i=1; i<=20; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		int su=1;
		boolean boo=true;
		while(true&&boo){
			if(su%2!=0) {System.out.print(su+" ");}
			su++;
			if(su>=20){boo=false;}
		}
		System.out.println();
		
		System.out.println("----------------------");
		
		System.out.println("Q2.");
		for(int i=1; i<=50; i++) {
			if(i%5==0){System.out.print(i+" ");}
		}
		System.out.println();
		for(int i=5; i<=50; i+=5) {
			System.out.print(i+" ");
		}
		System.out.println();
		su=1;
		boo=true;
		while(true&&boo){
			if(true) {System.out.print(5*su+" ");}
			su++;
			if(5*su>50){boo=false;}
		}
		System.out.println();
		
		System.out.println("----------------------");
		
		System.out.println("Q3.");
		int temp=0;
		for(int i=1; i<=50; i++) {
			temp=temp+i;
		}
		System.out.println("sum="+temp);
		System.out.println();
		
		su=1;
		boo=true;
		temp=0;
		while(true&&boo){
			if(su==50){boo=false;}
			temp=temp+su;
			su++;
		}
		System.out.println("sum="+temp);
		System.out.println();
		
		System.out.println("----------------------");
		
		System.out.println("Q4.");
		sum=0;
		for(int i=2; i<=10; i+=2) {
			if(i!=2){System.out.print('+');}
			System.out.print(i);
			sum+=i;
		}
		System.out.print("="+sum);
		System.out.println();
		
		System.out.println("----------------------");
		
		System.out.println("Q5.");
		int dan=2;
		su=1;
		for(su=1; su<10; su++){
			for(dan=2; dan<10; dan++){
				System.out.print(dan+"x"+su+" ");
			}
			System.out.println();
		}
		
	}

}