import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
////            표현식1
//            int[] int_arr1 = {1,2,3,4};
////            표현식2
//            int[] int_arr2 = new int[4];
//            int_arr2[0] = 1;
//            int_arr2[1] = 2;
//            int_arr2[2] = 3;
//            int_arr2[3] = 4;
////            표현식3
//        int[] int_arr3 = new int[]{1,2,3,4};
//
////        표현식4는 불가 : java의배열은 반드시 길이가 지정되어야함.
////        int[] int_arr4 = new int[];
//
//        int[] arr3 = {85, 65, 90};
//
//        int sum = 0;
//
//        for (int i =0; i < arr3.length; i++) {
//            sum += arr3[i];
//        }
//
//        double avg = (double)(sum / arr3.length);
//
//        System.out.println(sum);
//        System.out.println(avg);

//        최대값, 최소값
//        int[] arr = {10,20,30,12,8,17};
//        int max = arr[0];
//        int min = arr[0];
//        int sum = 0;
//        for(int i = 0; i < arr.length; i++) {
//            if(max < arr[i]){
//                max = arr[i];
//            }
//            if(min > arr[i]) {
//                min = arr[i];
//            }
//
//            sum += arr[i];
//        }
//
//        double avg = (double)(sum / arr.length);
//
//        System.out.println("min = " + min);
//        System.out.println("max = " + max);
//        System.out.println("sum = " + sum);
//        System.out.println("avg = " + avg);
//
////        배열의 순서바꾸기
//        int[] arr = {10,20};
//        int temp = 0;
//
//        temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//
//        System.out.printf(Arrays.toString(arr));

//        int[] arr2 = {10,20,30,40,50,60,70};
//        int temp2 = 0;
//        for(int i = 0; i < arr2.length - 1; i++){
//            temp2 = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp2;
//        }
//
//        System.out.printf(Arrays.toString(arr2));

////        배열뒤집기
//        int[] arr = {1,2,3,4,5};
////        신규배열 선언
//        int[] arr2 = new int[arr.length];
//
//        for(int i = 0; i < arr2.length; i ++) {
//            arr2[arr2.length - i -1] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr2));
//
//
////        배열 뒤집기 2
//        int temp = 0;
//        for(int i = 0; i < arr.length/2; i++){
//            temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
//
//        System.out.println(Arrays.toString(arr));


//        String 배열은 초기값이 null값이다.
//        그러므로 아래는 nullException가 난다.
//        String[] arr_st = new String[5];
//
//        for(int i = 0; i < arr_st.length; i++) {
//            if(arr_st[i].isEmpty()) {
//                System.out.println("비어있습니다.");
//            }
//        }

//        정렬 : sort함수 사용
        int[] arr = {1,3,2,4,6,45,3,4,4,6,2,3,3,23,4,3,4234,234,23,42,34,23,6,34,54,1,35,2,34,6,1,234,4,236,2,3};
//        오름차순 정렬이 기본
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

//        내림차순
//        방법1. Compareator클래스 사용
//        객체타입인 경우에만 Comparator클래스 사용가능

        String[] str_arr = {"hello", "hi", "bye", "goodmorning"};
        Arrays.sort(str_arr);
        System.out.println(Arrays.toString(str_arr));
        Arrays.sort(str_arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(str_arr));


//        Comparator클래스는 기본형 타입은 처리불가
//        Arrays.sort(arr, Comparator.reverseOrder());
//        방법2. 배열 뒤집기

//        배열뒤집기
//        신규배열 선언
        String[] str_arr2 = new String[str_arr.length];
        for(int i = 0; i < str_arr2.length; i ++) {
            str_arr2[str_arr2.length - i -1] = str_arr[i];
        }
        System.out.println(Arrays.toString(str_arr2));

//        StreamApi, lamdba를 활용한 내림차순 정렬
        int[] arr2 = {5,1,2,7,3,1,2};
        int[] new_arr2 = Arrays.stream(arr2) //arr2를 대상으로 stream 객체 생성
                .boxed()    // Integer로 형변환시킨 스트림 객체 생성
                .sorted(Comparator.reverseOrder())   //내림차순 정렬
                .mapToInt(a->a)   //Integer를 int로 변환
                .toArray();   // 배열로 변환


    }
}
