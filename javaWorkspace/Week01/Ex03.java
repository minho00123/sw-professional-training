class Ex03 {

    public static void main(String[] args) {
        System.out.println('a');
        System.out.println('가');
        System.out.println('\uac00');
        System.out.println('\\'); // \ 슬래시 출력
        // System.out.println(''); // 에러!
        char ch1;
        ch1 = '\uac01';
        System.out.println(ch1);
        char ch2;
        ch2 = 65;
        System.out.println(ch2);
        System.out.println(ch1+ch2); // 숫자로 출력
        System.out.println("문자열");
        System.out.println("문");
        System.out.println(""); // 집합의 개념이므로 빈 값도 가능하다.
        System.out.println("문자"+"열");
        System.out.println("문자"+1234);
        System.out.println("문자"+3.14); // 문자열과 연산을 수행하게 되면 문자열이 된다.
        System.out.println(6+2); // 8
        System.out.println("6"+2); // "62"
        String msg;
        msg = "문자열";
        System.out.println(msg);
        System.out.println(2024+1+"년"); // 2025년
        System.out.println("year"+2024+1); // year20241
        System.out.println("year"+(2024+1)); // year2025
        System.out.println(5+1); // 6
        System.out.println('5'+1); // 54
        System.out.println("-------------------");
        System.out.println("ABCD\nabcd");
        System.out.println("ABCD\tabcd");
        System.out.println("ABCD\babcd");
        System.out.println("https:\\\\naver.com");
        System.out.println("ABCD\"ab\"cd");
        System.out.println("ABCD\r\nabcd"); // 윈도우에서는 \r\n은 개행
        System.out.println("ABCD\u0009abcd");
        int su1,su2;
        su1=0xac00;
        su2=010;
        System.out.println("16진수 ac00 = " + su1);
        System.out.println("8진수 010 = " + su2);
    }

}