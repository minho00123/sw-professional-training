/*
Q1. A~Z까지 출력하시오

Q2. 다음을 출력하시오
		A(a),B(b),C(c),D(d),...,Y(y),Z(z)
		
Q3. 다음을 출력하시오
		1 2 3
		4 5 6
		7 8 9
		
Q4. 다음을 출력하시오
		1 2 3
		2 3 4
		3 4 5

Q5. 다음을 출력하시오
		A B C
		D E F
		G H I
*/

class Ex15 {

	public static void main(String[] args) {
		System.out.println("Q1.");
		for (int i = 65; i < 65+26; i++) {
			System.out.print((char) i + " ");
		}
		System.out.println();
		
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("------------------------------");
		
		System.out.println("Q2.");
		for (int i = 65; i < 65+26; i++) {
			if (i != 65) {
				System.out.print("," + (char) i + "(" + (char) (i + 32) + ")");
			} else {
				System.out.print((char) i + "(" + (char) (i + 32) + ")");
			}
		}
		System.out.println();
		
		char capitalLetter = 'A';
		char smallLetter = 'a';
		for (int i = 0; i < 26; i++) {
			if (i != 0) {
				System.out.print("," + (char) (capitalLetter + i) + "(" + (char) (smallLetter + i) + ")");
			} else {
				System.out.print((char) (capitalLetter + i) + "(" + (char) (smallLetter + i) + ")");
			}
		}
		System.out.println();
		
		System.out.println("------------------------------");
		
		System.out.println("Q3.");
		for (int i = 1; i <= 9; i++) {
			if (i % 3 == 1) {
				System.out.println();
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("---------------");
		System.out.println("Q4.");
		
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j <= i + 3; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("------------------------------");
		
		System.out.println("Q5.");
		for (int i = 65; i <= 73; i++) {
			if (i % 3 == 2) {
				System.out.println();
			}
			System.out.print((char) i + " ");
		}
		System.out.println();
		
		System.out.println("---------- 강사님 코드 ----------");
		System.out.println("Q1.");
		int cnt='Z'-'A'+1;
		for(int i=0; i<cnt; i++){
			System.out.print((char)('A'+i)+" ");
		}
		System.out.println();
		
		int su='A';
		while(su<='Z'){
			System.out.print((char)su++);
		}
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println("Q2.");
		for(int i=0; i<cnt; i++){
			if(i!=0){System.out.print(',');}
			System.out.print((char)('A'+i)+"("+((char)('a'+i))+")");
		}
		System.out.println();
		
		su='A';
		int gap='a'-'A';
		while(su<='Z'){
			System.out.print((char)su+"("+(char)(gap+su++)+")");
		}
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println("Q3.");
		cnt=0;
		for(int i=0; i<9; i++) {
			System.out.print(i+1);
			cnt++;
			if(cnt==3){System.out.println(); cnt=0;};
		}
		System.out.println();
		
		for(int j=0; j<3; j++){
			for(int i=1; i<=3; i++){
				System.out.print(3*j+i);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		System.out.println("Q4.");
		for(int j=0; j<3; j++){
			for(int i=1; i<=3; i++){
				System.out.print(j+i);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		System.out.println("Q5.");
		for(int j=0; j<3; j++){
			for(int i=1; i<=3; i++){
				System.out.print((char)(3*j+i+64));
			}
			System.out.println();
		}
	}

}