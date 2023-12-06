import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
        byte num1 = 127;
        byte num2 = -128;

        // byte로 썼을때, 범위는 127 ~ -128, 그 이상으로 값을 넣으면 오버플로우 상태가 됨
        num1++;
        num2--;

        System.out.println(num1);
        System.out.println(num2);
        
//        실수: float, double(기본)
        float f1 = 1.123456789f;
        double b1 = 1.123456789;
        System.out.println("f1 = " + f1);
        System.out.println("b1 = " + b1);


//        부동소수점 오차 테스트
        double double_num = 0.1;
//        미세오차는 조정되어 정상적으로 출력
        System.out.println(double_num);


        double double_num2 = 0;
//        반복적인 연산시 오차가 확대되어 오차확인가능
        for(int i = 0; i < 1000; i++){
            double_num2 += 0.1 * 10;
        }
        System.out.println(double_num2 / 10);

        String abc = "hello";

//        저장할때는 문자열 -> 연산할때는 정수로 변환 -> 최종결과는 실수로 반환
        BigDecimal myBig1 = new BigDecimal("1.03");
        BigDecimal myBig2 = new BigDecimal("0.42");
        double result = myBig1.subtract(myBig2).doubleValue();
        System.out.println(myBig1.subtract(myBig2));
        System.out.println(result);


//        문자: char
        char my_char = '가';
        System.out.println(my_char);

//        boolean : true(1) or false(0)
        boolean my_bool = true;
        System.out.println(my_bool);
        if(my_bool) {
            System.out.println("조건식이 참입니다.");
        }

        int bool_num1 = 20;
        int bool_num2 = 10;
        if(bool_num1 > bool_num2) {
            System.out.println("조건식이 참입니다.");

//            묵시적 타입 변환
            char ch1 = 'a';
            int ch1_num = ch1;

            System.out.println(ch1_num);

//            char형 알파벳 비교를 위한 묵시적 타입변환이 일어난다.
            System.out.println('A' > 'a');

            int my_int1 = 10;
//            int -> double
            double my_double1 = my_int1;
            System.out.println(my_double1);
//            에러 발생 : my_int1 = my_double1;
//            명시적 타입은 가능 : 소수점값 손실발생 가능성이 있다.
            my_int1 = (int)my_double1;
            double my_double = 7.2f;
            System.out.println(my_double);

//            명시적 타입 변환
            char my_char2 = 'b';
            int char_num = (int)my_char2;


//            int a가 1 int b가 4일떄 둘을 나눈값을 int에 담에 출력. double에 담아 출력.
            int a = 1;
            int b = 4;
            int answer1 = a / b;
            double answer2 = a / b;
            System.out.println(answer1);
            System.out.println(answer2);
            double answer3 = (double) a / b;
            System.out.println(answer3);
            
            
//            변수와 상수
//            선언과 동시에 초기화
            int a1 = 10;
//            변수값 변경
            a1 = 20;
//            선언만 한 뒤에 나중에 초기화
            int a2;     //선언만 됐을때는 값이 0으로 초기화
            a2 = 20;
//            상수는 값의 재할당이 불가능
            final int AGES = 20;
//            AGES = 30; 상수는 값의 변경이 불가능
//            상수는 선언만 한 뒤에 나중에 초기화 하는 방식이 java8이전에는 안됐지만, 이후 가능해짐.
            final int AGES2;
            AGES2 = 20;

//            int는 선언만 할경우 메모리상에 0이 할당
//            String은 선언만 할 경우 메모리상에 null이 할당
            

        }
    }
}
