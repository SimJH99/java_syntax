package C13Inheritance.C1304Protected;

public class C1304ProtectedTest  {
    public static void main(String[] args)  {
        C1304ProtectedClass pc = new C1304ProtectedClass();
        //private 접근 불가
//        System.out.println(pc.st1);

        //default 접근 가능
        System.out.println(pc.st2);
        
        //protected 접근 가능
        System.out.println(pc.st3);
        
        //protected 접근 가능
        System.out.println(pc.st4);
    }
}
