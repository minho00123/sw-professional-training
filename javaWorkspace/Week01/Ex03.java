class Ex03 {

    public static void main(String[] args) {
        System.out.println('a');
        System.out.println('��');
        System.out.println('\uac00');
        System.out.println('\\'); // \ ������ ���
        // System.out.println(''); // ����!
        char ch1;
        ch1 = '\uac01';
        System.out.println(ch1);
        char ch2;
        ch2 = 65;
        System.out.println(ch2);
        System.out.println(ch1+ch2); // ���ڷ� ���
        System.out.println("���ڿ�");
        System.out.println("��");
        System.out.println(""); // ������ �����̹Ƿ� �� ���� �����ϴ�.
        System.out.println("����"+"��");
        System.out.println("����"+1234);
        System.out.println("����"+3.14); // ���ڿ��� ������ �����ϰ� �Ǹ� ���ڿ��� �ȴ�.
        System.out.println(6+2); // 8
        System.out.println("6"+2); // "62"
        String msg;
        msg = "���ڿ�";
        System.out.println(msg);
        System.out.println(2024+1+"��"); // 2025��
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
        System.out.println("ABCD\r\nabcd"); // �����쿡���� \r\n�� ����
        System.out.println("ABCD\u0009abcd");
        int su1,su2;
        su1=0xac00;
        su2=010;
        System.out.println("16���� ac00 = " + su1);
        System.out.println("8���� 010 = " + su2);
    }

}