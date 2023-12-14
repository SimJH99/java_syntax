package C12ClassLecture;

public class C1202Class {
    public static void main(String[] args) {
        int sum = MyCaluclator.sum(10,20);
//        A부서의 매출
        MyCaluclator.sum_acc(10);
        MyCaluclator.sum_acc(20);
        MyCaluclator.sum_acc(30);
        System.out.println(MyCaluclator.total);

//        B부서의 매출
        MyCaluclator.sum_acc(20);
        MyCaluclator.sum_acc(30);
        MyCaluclator.sum_acc(40);
        System.out.println(MyCaluclator.total);
//        클래스변수를 공용으로 사용하다보니, 변수와 메서드에 고유성이 보장되지 않음.
        
//        A부서의 매출
        MyCal myCalA = new MyCal();
        myCalA.sum_acc(10);
        myCalA.sum_acc(20);
        myCalA.sum_acc(30);
        System.out.println(myCalA.total);

//        B부서의 매출
        MyCal myCalB = new MyCal();
        myCalB.sum_acc(20);
        myCalB.sum_acc(30);
        myCalB.sum_acc(40);
        System.out.println(myCalB.total);

    }
}

//    내부클래스
class MyCaluclator{
    static int total = 0;
    //    매개변수 2개 받아서 더한 값 return : sum
    static int sum(int a, int b){
        return a + b;
    }

    static void sum_acc(int a){
        total += a;
    }
}

class MyCal{
//    static이 뭍어있는 변수는 클래스 변수, static이 붙어있지 않으면 객체변수
    int total = 0;
    //    매개변수 2개 받아서 더한 값 return : sum
    int sum(int a, int b){
        return a + b;
    }
    void sum_acc(int total){
//        this는 객체 자기 자신을 의미
        this.total += total;
    }
}

