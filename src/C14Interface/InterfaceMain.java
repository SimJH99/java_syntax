package C14Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        AnimalInterface1 myCat = new CatImplements();
        myCat.makeSound();
        AnimalInterface1 myDog = new DogImplements();
        myDog.makeSound();

//        다형성이랑 하나의 객체가 여러개의 참조변수를 가질 수 있음을 의미
        CatMultiImplements myMulCat = new CatMultiImplements();
        myMulCat.makeSound();
//        타입을 interface1으로 선언하면 interface2에 정의된 메서드는 사용불가
        System.out.println(myMulCat.play("나비", "뽀삐"));
        DogMultiImplements myMulDog = new DogMultiImplements();
//        타입을 interface2으로 선언하면 interfave1에 정의된 메서드는 사용불가.
        myMulDog.makeSound();
        System.out.println(myMulDog.play("백구","덕구"));
//        기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나, 익명내부클래스 방식으로 사용가능
        AnimalInterface1 ai = new AnimalInterface1() {
            @Override
            public void makeSound() {

            }
        };
    }
}
