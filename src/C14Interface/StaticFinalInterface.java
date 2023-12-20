package C14Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyImplements mi = new MyImplements();
        mi.methodA();
        System.out.println(mi.my_string);
    }
}

interface MyInterface {
//        아래 변수는 컴파일타임에 static final이 붙는다.
//    상수이자 클래스변수
    int my_constant = 100;
    String my_string = "make";
    void methodA();
}

class MyImplements implements MyInterface {
    @Override
    public void methodA() {
        System.out.println(my_constant);
    }
}