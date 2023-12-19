package C13Inheritance;


//Animal 클래스 : sound() -> 동물은 소리를 냅니다.
//dog클래스 : Animal상속 -> sound overriding : 멍멍
//cat클래스 : Animal상속 -> sound overriding : 야옹
public class C1303MethodOverriding {
    public static void main(String[] args) {
        // 상속관계일때, 부모클래스 타입을 자식클래스객체의 타입으로 지정 가능
        Animal dog1 = new Dog();
        Dog dog2 = new Dog();
//        위 두 개의 차이점 : 위에는 Animal클래스에 정의된 메서드만 사용가능하도록 제약이 발생.

        Cat cat = new Cat();

        dog1.sound();
        cat.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("동물은 소리를 냅니다.");
    }
}

class Dog extends Animal{
    @Override
    void  sound(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("야옹");
    }
}
