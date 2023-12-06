import java.beans.PropertyEditorSupport;

public class C05LoopPractice {
    public static void main(String[] args) {
////        짝수의 합 계산하기
////        1 ~ 20까지 짝수의 합 출력
//        int sum = 0 ;
//        for(int i = 1; i <= 20; i++) {
//            if(i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

////        숫자 뒤집기
//        int a = 1234;
//        int result = 0;
//        while (true) {
//            int temp = a % 10;
//            result = result * 10 + temp;
//            a /= 10;
//            if(a == 0){
//                break;
//            }
//        }
//
//        System.out.println(result);

////        최대공약수 구하기 24 , 36
//        int a = 24; int b = 36;
//        int min = (a < b) ? b : a;
//        int answer = 0;
//        for(int i = 1; i <= min; i++) {
//            if(a % i == 0 && b % i == 0) {
//                answer = i;
//            }
//        }
//        System.out.println(answer);
//
////        최소공배수 구하기 24 , 36
//        int minNum = (a/answer) * (b/answer) * answer;
//        System.out.println(minNum);



//        이중반복문으로 구구단 출력하기

        for(int i = 1; i < 10; i++) {
            for(int j = 2; j < 10; j++) {
                System.out.print(j + " X " + i + " = " + i*j + " | ");
            }
            System.out.println();
        }



    }
}
