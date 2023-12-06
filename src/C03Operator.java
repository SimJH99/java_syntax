public class C03Operator {
    public static void main(String[] args) {
//       산술연산자
        int num1 = 8;
        int num2 = 3;


//       *, / : 나눗셈, % : 나머지
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));


//        대입연산자
        int n1 = 7; int n2 = 7; int n3 = 7;

        n1 = n1 - 3;
        n2 -= 3;
        n3 =- 3;


//        /=, %=
        int n4 = 10;
        int n5 = 10;

        System.out.println(n4 /= 3);
        System.out.println(n5 %= 3);


//        증감연산자
        int a = 5;
        int b = a++;    //후위연산자 : 실행문이 끝나고 증감
        System.out.println(a);  //6
        System.out.println(b);  //5

        a = 5;
        b = ++a;    //전위연산자 : 실행문이 끝나기전에 증감
        System.out.println(a);  //6
        System.out.println(b);  //6


//        비교연산자 : ==, !=. >, >=, ...
        char char1 = 'a';
        char char2 = 'A';

        System.out.println(char1 == char2);
        System.out.println(char1 != char2);


//        논리연산자 : &&, ||, !
        int num3 = 10;
        int num4 = 20;
        boolean result1;
        boolean result2;


//        result1에 num3이 5보다 큰지 조건과 num3이 20보다 작은지 조건을 and조건을 통해 boolean 담기
        result1 = num3 > 5 && num3 < 20;
        System.out.println("result1 : " + result1);


//        result2에 num4가 10보다 작은 조건과 num4가 30보다 큰 조건을 or조건을 통해 boolean값 담기
        result2 = num4 < 10 || num4 > 30;
        System.out.println("result2 : " + result2);


//        result2에 !달아서 출력
        System.out.println("!result2 : " + !result2);


//        이진법
//        0000101       // 0000110
        int i = 5; int j = 6;
//        비트연산자 : &, 비트 상에서 각자리의 수가 모두 1일경우만 1
        System.out.println(i & j);      // 4 출력 => 0000100
//        비트연산자 : \, 비트 상에서 각자리의 수가 하나라도 1이면 1
        System.out.println(i | j);      // 7 출력 => 0000111
//        비트연산자 : ^, 비트 상에서 각자리의 수가 일치하지 않은 경우에만 1
        System.out.println(i ^ j);      // 3 출력 => 0000011
//        비트연산자 : ~, 비트 상에서 각자리의 수의 반대인 값을 변환
        System.out.println(~i);
//        시프트연산자 : <<, >>  => 곱셈과 나눗셈의 효과가 발생
        System.out.println(i << 1);


        int c = 13;     //00001101
        int d = 9;      //00001001


        while (b!=0) {
            int same_index = c & d;     //and연산으로 구한 carry생성
            c = c ^ d;  //XOR연산으로 구한 비트값 a에 할당
            d = same_index << 1;
        }
//        반복 1회차
//        sameindex : 1001
//        c : 00100
//        d : 10010
//        반복 2회차
//        c : 10110
        System.out.println(c);
    }
}
