package C15AnonymousLambda;

import java.util.Arrays;

public class C1505STreamAPI1 {
    public static void main(String[] args) {
        int[] arr = {20,10,4,12};
//        전통적인 방식의 데이터 접근방식
        for(int i = 0 ; i< args.length; i++){
            System.out.println(arr[i]);
        }

//        데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식
//        java에서 함수형프로그래밍을 지원하기위한 라이브러리 -> Stream API
//        foreach : 스트림의 각 요소를 소모하면서 동작을 수행
        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
        System.out.println();
        Arrays.stream(arr).sorted().forEach(a -> System.out.print(a + " "));

    }
}
