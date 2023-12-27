package C18Thread;

import java.net.NoRouteToHostException;

public class MainClass {
    public static void main(String[] args) {
//        작업 빙식으로 스레드 생성
        ExtendsThreadClass etc1 = new ExtendsThreadClass();

        Thread etc2 = new ExtendsThreadClass();
        etc2.start();
        Thread etc3 = new ExtendsThreadClass();
        etc3.start();
        Thread etc4 = new ExtendsThreadClass();
        etc4.start();

        new ExtendsThreadClass().start();
//        스레드 실행시 순차적으로 실행되지 않음에 유의

//        Thread 생성자로 Runnable 객체를 주입하는 방식.
//        Thread 클래스에 Runnalbe 객체가 전달되어 사용자가 정의 run 메서드가 실행
        new Thread(new RunnableImplementsClass()).start();
        new Thread(() -> System.out.println("익명객체 스레드")).start();


////        thread의 동시성 이슈 테스트
////        단일 스레드 일반호출
//        for(int i = 0; i< 1000; i++){
//            Library.borrowBook();
//        }
//        System.out.println("최종 남은 수량 " + Library.bookcount);

        for(int i =0; i< 1000; i++){
            Thread th = new Thread(() -> Library.borrowBook());
            th.start();
////            join메서드를 통해 다른 스레드가 완료전까지 새로운 스레드가 실행되지 않도록 막음.
//            try {
//                th.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
        System.out.println("최종 남은 수량 " + Library.bookcount);
    }
}
