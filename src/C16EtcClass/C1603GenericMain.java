package C16EtcClass;

import java.util.Arrays;

public class C1603GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C++"};

        Swap(stArr,1,2);
        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {1,2,3,4,5};
        Swap(intArr, 1,2);
        System.out.println(Arrays.toString(intArr));

        GenericStudent<String> st1 = new GenericStudent<>();
        st1.setAge("24");
        System.out.println(st1.getAge().getClass());

        GenericStudent<Integer> st2 = new GenericStudent<>();
        st2.setAge(21);
        System.out.println(st2.getAge().getClass());
    }
//        String[]배열 change메서드 생성 : a번째 b번째
//    static void stSwap(String[] stArr, int a, int b){
//        String temp = "";
//        temp = stArr[a];
//        stArr[a] = stArr[b];
//        stArr[b] = temp;
//    }
////        Integer[] 배열 change메서드 생성 : a번째 b번째
//    static void intSwap(Integer[] intArr, int a, int b){
//        Integer temp = 0;
//        temp = intArr[a];
//        intArr[a] = intArr[b];
//        intArr[b] = temp;
//    }
//        제네릭 메서드 생성 : 반환타입 왼쪽에 <T> 선언
//        제네릭은 객체타입이 들어와야함에 유의
    static <T> void Swap(T[] arr, int a, int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}

// GenericStudent 클래스 생성 : String name, String age 객체 1개는
// String age형태로 생성, int age형태로 생성
class GenericStudent<T>{
    String name;
    T age;

    public String getName() {
        return name;
    }

    public void setName(String  name) {
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
}
