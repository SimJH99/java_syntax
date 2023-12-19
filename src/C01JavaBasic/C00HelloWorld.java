package C01JavaBasic;

public class C00HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");

        //정수형
        int a = 20;
        System.out.println(a);

        //문자열
        String myString = "hello world";
        System.out.println(myString);

        //문자열과 정수를 합치면 문자열이 된다.
        System.out.println(myString + a);
    }
}
