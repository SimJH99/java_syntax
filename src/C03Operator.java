public class C03Operator {
    public static void main(String[] args) {
        //    산술연산자
        int num1 = 8;
        int num2 = 3;

//    *, / : 나눗셈, % : 나머지
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));


//        대입연산자
        int n1 = 7;
        int n2 = 7;
        int n3 = 7;

        n1 = n1 - 3;
        n2 -= 3;
        n3 =- 3;


//        /=, %=
        int n4 = 10;
        int n5 = 10;

        System.out.println(n4 /= 3);
        System.out.println(n5 %= 3);






    }
}
