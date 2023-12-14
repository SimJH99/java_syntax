package C12ClassLecture;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class C1201MethodPractice {
    public static void main(String[] args) {
//        소수: 1과 자기자신을 제외해서는 약수가 없는것.
//        소수인지 아닌지 판별하는 메서드 생성
//        리턴 타입 boolean
//        main메서드에서 호출하여 테스트

        boolean anwser = isPrime(1);

        System.out.println(anwser);

    }

    static boolean isPrime(int num){
        boolean answer = true;
        for(int i=2; i*i <=num; i++){
            if(num%i==0){
                return false;
            }
        }
        return answer;
    }

    static void isPrimePrint(int a){
        for(int i = 2; i < a;i++){
            if(a % i == 0){
                System.out.println("소수가 아닙니다.");
                return;
            }
        }
        System.out.println("소수입니다.");
    }
}
