package C01JavaBasic;

public class C1102StackFunction2 {
    public static void main(String[] args) {
        System.out.println("main함수 시작");
        System.out.println(funtion1(1));
        System.out.println("main함수 끝");
    }

    static int funtion1(int a){
        System.out.println("funtion1 시작");
        System.out.println("funtion1 끝");
        return funtion1(a*2);
    }
}
