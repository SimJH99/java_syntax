package C15AnonymousLambda;

//인터페이스 선성 : LambdaInterface
// makeString, 매개변수 String 2개

//LambdaExpression 클래스의 main에서
//LambdaExpression 익명객체를 화살표 함수 방식으로 구현
//-> 2개의 문자열을 받아서 더해서 출력

public class C1503LambdaExpression {
    public static void main(String[] args) {
        String myStr1 = "집에 ";
        String myStr2 = "가고싶다.";

//        실행문이 한 개일때에는 {}제외하고 return생략가능
//        실행문이 두 개이상 일때에는 {}포함하여 return 필요
//        매개변수를 순서로 인지하므로, 타입을 지정해줄필요는 없다.
        LambdaInterface mi = (a, b, c) -> {
            String answer = a+b;
            return answer;
        };
        System.out.println(mi.makeString(myStr1, myStr2, 1));

    }
}

interface LambdaInterface {
    String makeString(String a, String b, int c);
}
