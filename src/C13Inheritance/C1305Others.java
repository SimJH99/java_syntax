package C13Inheritance;

//improt java.util.* : util하위의 모든 클래스/인터페이스 파일 import가능
//improt java.* : 불가능, 특정패키지의 하위패키지의 모든 파일까지 import하는 것은 불가능.


//final 클래스는 상속 불가
//public class C1305Others extends FinalClass {
//
//}

public class C1305Others{
    public static void main(String[] args) {
        C1305Dog myDog = new C1305Dog();
        myDog.makeSound1();
        myDog.makeSound2();

        //익명 객체
        //추상클래스는 객체로 생성할 수 없지만, 추상클래스를 객체로 선언할 때, 추상메서드를 직접 구현하여 오버라이딩하면 가능은 하다.
        // 그러나 객체의 클래스가 불분명하여 익명객체라한다.
        C1305Animal myAnimal = new C1305Animal() {
            @Override
            void makeSound1() {

            }
        };

        System.out.println(myDog.getClass());
        System.out.println(myAnimal.getClass());
    }
}

final class FinalClass{

}

abstract class C1305Animal{
//    final void makeSound(){
//        System.out.println("동물은 소리를 냅니다.");
//    }

    abstract void makeSound1();

    void makeSound2(){
        System.out.println("makeSound2");
    }
}
class  C1305Dog extends C1305Animal{
//    final메소드는 오버라이딩이 불가능

//    @Override
//    void makeSound(){
//        System.out.println("왈왈");
//    }

    @Override
    void makeSound1() {
        System.out.println("makeSound1");
    }
}

