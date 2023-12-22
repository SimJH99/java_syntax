package C15AnonymousLambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C1505STreamAPI1 {
    public static void main(String[] args) {
//        int[] arr = {20,10,4,12};
////        전통적인 방식의 데이터 접근방식
//        for(int i = 0 ; i< args.length; i++){
//            System.out.println(arr[i]);
//        }
//
//        데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식
//        java에서 함수형프로그래밍을 지원하기위한 라이브러리 -> Stream API
//        foreach : 스트림의 각 요소를 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a -> System.out.println(a));
//
////        스트림의 생성
//        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
////
//        char[] chArr = {'a', 'b', 'c'};
////        stream<객체> : 제네릭타입으로 stream 객체가 생성
//        Stream<String> stStream = Arrays.stream(stArr);
//
//
//        int[] intArr = {10,20,30,40,50};
//        IntStream intStream = Arrays.stream(intArr);
//        int[] intArr2 = intStream.filter(a -> a > 20).toArray();
//        System.out.println(Arrays.toString(intArr2));
//
////        참조변수의 스트림변환의 경우 제네릭의 타입소거 문제발생.
////        제네릭의 타입소거란 java버전의 호환성을 위해 제네릭 타입을 런타임 시점에 제거하는 것을 의미
////        String[] stArr2 = stStream.filter(a -> a.length() <= 4).toArray(a->new String[a]);
////        메소드 참조 방식으로 표현하는 것이 더 일반적
////        메소드 참조 방식 : 클래스::메서드
//        String[] stArr3 = stStream.filter(a -> a.length() <= 4).toArray(String[]::new);
//        System.out.println(Arrays.toString(stArr3));
//
////        stream 중개연산 : filter, map, sorted, distinct
////        distinct : 중복제거 후 스트림 반환
//        int[] intArr2 = {10,20,30,40,50};
////        중복제거 후 총합 반환
//        int answer = Arrays.stream(intArr2).distinct().sum();
//
//
////        중복제거후 새로운 배열 생성
//        String[] stArr = {"java", "java", "python", "C++"};
//        String[] stArr2 = Arrays.stream(stArr).distinct().toArray(String[]::new);
//
//
//
////        중복제거하고 길이가 3개 이하인 것으로 제한하고, 남은 배열의 길의 총합.
////        mapToInt를 통해 IntStream으로 변환
//        IntStream myStream = Arrays.stream(stArr).distinct().filter(a->a.length()<=3).mapToInt(a -> a.length());
//
//
////        sorted : 정렬된 스트림반환
//        int[] arr = {5,1,2,3,4,8,7};
////        오름차순 정렬된 숫자 신규 배열 반환
//        int[] new_arr =  Arrays.stream(arr).sorted().toArray();
//
//
//
////        리스트 스트림으로 내림차순 정렬
//        List<Integer> myList = new ArrayList<>(Arrays.asList(6,1,2,3,1,6));
////        collet(변환할컬랙션객체명시)
//        List new_list = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//
//
//        List<String> stList = new ArrayList<>(Arrays.asList("java", "python", "C++", "javascript"));
////        streamAPI를 사용해서 문자열의 길이 4개 이상인, 문자열의 길이를 기준으로 정렬(내림) 후 신규List생성
//        List newStrList = stList.stream().filter(a->a.length()>=4)
//                .sorted((o1, o2) -> o2.length() - o1.length())
//                .collect(Collectors.toList());
//
////        정수배열 arr의 모든 값들을 10씩 증가시킨 배열
//        int[] arr_plus10 = Arrays.stream(arr).map(a->a+10).toArray();
//
////        arr에서 짝수만 골라서 해당 수의 제곱의 총합을 구하라. sum();
//        int arr_sum = Arrays.stream(arr).filter(a->a%2==0).map(a->a*a).sum();
//
////        스트림소모 : forEach, reduce
////        reduce : 누적연산
//        int[] arr = {10,20,30,40};
//        Arrays.stream(arr).forEach(System.out::println);
//
////        초기값을 지정하지않으면 Optional 객체 return
////        Optional객체 : 값이 있을 수 도 있고, 없을 수 도 있다는 것을 명시한 타입(java8이후 추가)
////        String a = null;
////        System.out.println(a.length());
//        Optional<String> myOptional = Optional.ofNullable("hello");
//        if(myOptional.isPresent()){
//            System.out.println(myOptional.get().length());
//        }
//
////        배열 원소마다 누적곱
//        int result = Arrays.stream(arr).reduce(1,(a,b)->a*b);
//        System.out.println(result);
//
////        배열 값들의 총합
//        int sum1 = Arrays.stream(arr).reduce(0,(a,b)->a+b);
//        int sum2 = Arrays.stream(arr).reduce((a,b)->a+b).getAsInt();
//        System.out.println(sum1);
//
//
//        String[] stArr = {"hello", "java", "world"};
////        문자열 배열을 하나로 출력하되 값 사이에 ", "을 넣어서 출력
////        1번
//        String answer = Arrays.stream(stArr).reduce((a,b)->a+", "+b).get();
////        2번
//        Optional<String> answer2 = Arrays.stream(stArr).reduce((a,b)->a+", "+b);
//        if(answer2.isPresent()){
//            System.out.println(answer2.get());
//        }
//
////        최소/최대/평균/총합/개수 : min/max/average/sum/count
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//
//        int minValue = myList.stream().mapToInt(a->a).min().getAsInt();
//        int maxValue = myList.stream().mapToInt(a->a).max().getAsInt();
//        int sumValue = myList.stream().mapToInt(a->a).sum();
//        double avgValue = myList.stream().mapToInt(a->a).average().getAsDouble();
//        long countValue = myList.stream().count();
//        System.out.println(minValue);
//        System.out.println(maxValue);
//        System.out.println(sumValue);
//        System.out.println(avgValue);
//        System.out.println(countValue);
//
////        findFirst, FindAny
//        List<Student> myStudents = new ArrayList<>();
//        myStudents.add(new Student("심", 24));
//        myStudents.add(new Student("이", 33));
//        myStudents.add(new Student("홍", 22));
//        myStudents.add(new Student("김", 43));
//        myStudents.add(new Student("조", 36));
//
////        Student s1 = myStudents.stream().filter(a->a.getAge()>=30).findAny().get();
////        System.out.println(s1);
//
////        1) 가장 나이 어린 사람 찾기
//        Student s2 = myStudents.stream().sorted((o1,o2) -> o1.getAge() - o2.getAge()).findFirst().get();
////        2) 30대가 몇명인지 출력
//        long stu30Count = myStudents.stream().filter(a->a.getAge()>=30).count();
////        3) 모든 객체의 평균나이
//        double stuAvg = myStudents.stream().mapToDouble(a->a.getAge()).average().getAsDouble();
////        4) 30세 이하 선착순 누구인지 객체 출력
//        Student firstStudent = myStudents.stream().filter(a->a.getAge()<=30).findFirst().get();
//
////        기존의 java의 null
//        String st = null;
//        System.out.println(st.compareTo("abc"));
//
////        java8 이후에 나온 Optional객체를 통해 특정 객체에 값이 없을지도 모른다는 것을 명시적으로 표현
////        Optional객체에 빈값을 명시적으로 넣는 방법 : Optional.empty();
//        Optional<String> opt1 = Optional.empty();
//        if(opt1.isPresent()){
//            System.out.println(opt1.get().compareTo("abc"));
//        } else {
//            System.out.println("값이 없습니다.");
//        }
////        optional 객체 생성
//        Optional<String> opt2 = Optional.ofNullable("hello");   //null이 있을 수도 있음을 의미
////        orElse관련 메서드를 사용하여 null(빈값)처리
////        orElse(), orElseGet(), orElseThrow()
////        orElse() : 값이 있으면 해당값 return, 없으면 default 지정값 return
//        System.out.println(opt1.orElse("").compareTo("abc"));
////        orElseGet() : 값이 있으면 해당값 return, 없으면 매개변수로 람다함수 또는 메소드 참조가 들어옴
//        System.out.println(opt1.orElseGet(()->new String()).compareTo("abc"));
////        orElseThrow() : 값이 있으면 해당값 return, 없으면 지정된 예외 강제 발생
//        opt1.get();
//        int result = opt1.orElseThrow(()->new NoSuchElementException("객체에 값이 없습니다.")).compareTo("abc");
////        System.out.println(result);
//
////        OptionalInt, OptionalDouble
//        OptionalInt oi = new ArrayList<>(Arrays.asList(1,2,3,4)).stream().mapToInt(a->a).max();
////        isPresenet로 check
//        if(oi.isPresent()){
//
//        } else {
//
//        }
////        orelse 등의 방법 활용
//        System.out.println(oi.orElseThrow(()->new NoSuchElementException("no value")));


    }
}

