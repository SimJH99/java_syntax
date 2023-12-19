package C13Inheritance;

//super(): 부모클래스의 생성자를 의미 , super키워드: 부모클래스 의미
//클래스 상속은 중복이 안된다.
//두 클래스에 같은이름의 메소드가 있는 경우에 상속 받았을 때, 어떤 부모의 메소드인지 모르기때문
public class C1302SuperChildClass extends SuperParents{
    int a;
    int b = 20;

    C1302SuperChildClass(){
        super(100);
        a = 30;
    }
    void display(){
        super.display();
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        C1302SuperChildClass sc = new C1302SuperChildClass();
        sc.display();
    }
}

class SuperParents{
    int a = 1;

    //생성자
    SuperParents(int a){
        this.a = a;
    }
    void display(){
        System.out.println("부모클래스입니다.");
    }
}