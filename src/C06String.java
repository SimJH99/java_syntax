import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {


////        참조자료형 : 기본 자료형을 제외한 모든 자료형
////        Wrapper class : 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스
//
////        int와 Integer간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
////        오토언박싱 : Integer -> int 형변환
//        int c = b;
//
////        언박싱   : Integer -> 형변환
//        int d = b.intValue();
//
////       오토박싱
//        Integer e = a;
//
////        박싱
//        Integer f = Integer.valueOf(a);
//
//
////        String과 int의 형변환
//        int a = 10;
//        String st_a = Integer.toString(a);  // "10"
//        String st_a2 = String.valueOf(a);
//        int c = Integer.parseInt(st_a);     // 10
//
////        참조자료형에 원시자료형을 담을 때는 wrapper클래스를 써야한다.     ex)컬렉션프레임워크(List, set ...)
//        List<Integer> list_a = new ArrayList<>();
//        list_a.add(10);
//        list_a.add(20);
//        list_a.add(30);
//        System.out.println(list_a);
//
//
//        String mySt1 = new String("hello");
//        String mySt2 = new String("hello");
//        String mySt3 = "hello";
//        String mySt4 = "hello";
//        String mySt5 = mySt1;
//
//
//        System.out.println(mySt1 == mySt2);     //fasle
//        System.out.println(mySt1 == mySt3);     //false
//        System.out.println(mySt3 == mySt4);     //true
//        System.out.println(mySt5 == mySt1);     //true
//
//
//        System.out.println(mySt1.equals(mySt2));     //true
//        System.out.println(mySt1.equals(mySt3));     //true
//        System.out.println(mySt3.equals(mySt4));     //true
//        System.out.println(mySt1.equals(mySt5));     //true


////        문자열의 길이 : length();
//        String mySt = "hello ";
//        System.out.println(mySt.length());
//
////        indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치 반환
//        String mySt2 = "hello java";
//        System.out.println(mySt2.indexOf("java"));
//
////        contains : 특정 문자열이 있는지 여부를 boolean으로 리턴
//        String mySt3 = "hello java";
//        System.out.println(mySt3.contains("java"));
//
////        charAt : 특정 index의 문자값을 리턴
//        String a = "hello";
//        char myChar = a.charAt(1);
//        System.out.println(myChar);
//
//
////       반복문, charAt, length를 활용한 문자열b 안에 문자a의 개수
//        String b = "abcdefabaadf";
//        int count = 0;
//        for(int i = 0; i < b.length(); i++) {
//            if(b.charAt(i) == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);

////        substring(a,b) : a이상 b미만의 index를 자른다.
//        String st1 = "hello world";
//        System.out.println(st1.substring(0, 5));
//        System.out.println(st1.substring(6, st1.length()));
//
////          trim, strip
//        String trimSt = "          hello world  ";
//        String new_trimSt = trimSt.trim();
//        System.out.println(new_trimSt);

//        String a = "Hello";
//        String a1 = a.toUpperCase();
//        String a2 = a.toLowerCase();
//
//        System.out.println(a1);
//        System.out.println(a2);

//        String b = "hello";
//        b += " world";
//        System.out.println(b);

//        char -> String 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);

//        String str = "01abc123한글123";
//
////        알파벳만 빼고 문자를 str2에 새롭게 담기.
//        String str2 = new String();
//
//        for(int i = 0; i < str.length(); i++){
//            char char1 = str.charAt(i);
//            if(!(char1 >= 'a' && char1 <= 'z')){
//                str2 += char1;
//            }
//        }
//
//        System.out.println(str2);

//        replace(a,b)
//        문자열 중에 특정 문자열을 바꿔 새로운 문자열을 return
//        replaceAll : replace와 동일한 기능, 다만 정규표현식을 활용할 수 있음.
//
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);
//
////        replaceAll
//        String st3 = st1.replaceAll("world","python");
//        System.out.println(st3);
//
//
//        String str4 = "01aBc123한글123DFg";
////        [a-z] : 소문자 알파벳
//        String str_eng = str4.replaceAll("[a-z]","");
//        System.out.println(str_eng);
////        [가-힣] : 한글
//        String str_kor = str4.replaceAll("[가-힣]","");
//        System.out.println(str_kor);
////        [0-9] : 숫자
//        String str_int = str4.replaceAll("[0-9]","");
//        System.out.println(str_int);
//
////        [A-Za-z] : 알파벳 전체
//        String str_Eng = str4.replaceAll("[A-Za-z]","");
//        System.out.println(str_Eng);
//
////        [A-Za-z0-9] : 알파벳 전체 와 숫자
//        String str_all = str4.replaceAll("[A-Za-z0-9]","");
//        System.out.println(str_all);
//
//
////        Pattern 클래스
//        boolean match = Pattern.matches("[a-z]+", "helloworld");
//        System.out.println(match);

////        전화번호 검증
////        \d : 숫자, {}: 연속으로
//        boolean match2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", "010-1234-1234");
//        System.out.println(match2);
//
//
////        이메일 검증
////        \d : 숫자, {}: 연속으로
//        boolean match3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", "hello1@naver.com");
//        System.out.println(match3);

////        split
//        String a = "a:b:c:d";
//        String[] stArr = a.split(":");
//        System.out.println(Arrays.toString(stArr));
//        String b = "a  b c d";
//        String[] stArr2 = b.split(" ");
//        System.out.println(Arrays.toString(stArr2));
//
//        String[] stArr3 = b.split("\\s+");
//        System.out.println(Arrays.toString(stArr3));

////        isEmpty와 null구분
//        String st1 = null;
//        String st2 = "";
//
//        System.out.println(st1 == null);
//        System.out.println(st2 == null);
//        System.out.println(st2.isEmpty());
////        NullPointer Exception발생
//        System.out.println(st1.isEmpty());
//
//        String[] arr = new String[5];
//        arr[0] = "hello";
//        arr[1] = "world";
//
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i].length());
//        }


////        join : String[] -> String
//        String[] str = {"hello", "world", "java", "python", "linux"};
//        String str1 = String.join(" ", str);
//        System.out.println(str1);


////        StringBuffer
//        StringBuffer sb1 = new StringBuffer("hello");
//        System.out.println(sb1.toString());
//        sb1.append(" world");
//        System.out.println(sb1);
//        sb1.insert(5, " java");
//        System.out.println(sb1);
//        System.out.println(sb1.substring(6, 10));
//        sb1.delete(5,10);
//        System.out.println(sb1);
//
////        성능 : string < StringBuffer < StringBuilder(스레드 safe X)
//        StringBuilder sb2 = new StringBuilder("hello");
//        sb2.append(" world");
//        System.out.println(sb2);
    }
}
