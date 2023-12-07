import java.util.Arrays;
import java.util.Scanner;

public class C05LoofStatements {
    public static void main(String[] args) {

////        2 ~ 10사이에 숫자를 차례대로 출력
//        int a = 2;
//
//        while (a <= 10) {
//            System.out.print(a + " ");
//            a++;
//        }
//
////        사용자에게 몇 단인지 입력받고 구구단 알려주는 while문
//        while(true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("구구단 단수를 입력해주세요.");
//            int input = sc.nextInt();
//            int b = 1;
//            while (b < 10) {
//                System.out.println(input + " X " + b + " = " + (input * b));
//                b++;
//            }
//        }


////        도어락키 if문 예제 : 비밀번호를 맞추면 반복이 종료되고, 그렇지 않으면 계속적으로 다시 질문
////        최대 5번까지만 비밀번호 입력가능하도록 => 입력횟수를 초과했습니다 라는 문구
//        String password = new String();
//        password = "1234";
//        int door = 0;
//        boolean open = false;
//        while(true) {
//            Scanner myScan = new Scanner(System.in);
//            System.out.println("비밀번호를 입력해주세요");
//            String input_password = myScan.nextLine();
//
//            if (password.equals(input_password)) {
//                System.out.println("문이 열립니다.");
//                break;
//            } else {
//                door++;
//                System.out.println("비밀번호가 " + door + "번 틀렸습니다,.");
//
//            }
//
//            if(door == 5) {
//                System.out.println("입력횟수를 초과했습니다.");
//                break;
//            }
//        }


////        for문으로 2~ 10까지 출력
//        int num = 2;
//        for (int i = num; i <= 10; i ++) {
//            System.out.print(i + " ");
//        }
//
////        continue를 사용해서 홀수만 출력되도록 (1~10 까지 수중에서)
//        int num1 = 1;
//        for(int i = num1; i <= 10; i++){
//            if(i % 2 == 0){
//                continue;
//            }
//            System.out.print(i + " ");
//        }


////        배열과 enhance for문
//        int[] myArr = {1,5,7,9,10};
//
////        일반 for문
//        for(int i = 0; i< 5; i ++){
//            System.out.print(myArr[i] + " ");
//        }
//
//        System.out.println();
//
////        enhanced for문
//        for(int a1 : myArr) {
//            System.out.print(a1 + " ");
//        }
//
//        System.out.println();
//
////        일반 for문을 통해 myArr의 값에 10씩 더한뒤에 출력
//        for (int i = 0; i < myArr.length; i++) {
//            myArr[i] += 10;
//        }
//        System.out.println(Arrays.toString(myArr));
//
////        enhanced for문을 통해 myArr의 값에 10씩 더한뒤에 출력.
//        for(int e : myArr) {
//            e += 10;
//        }
//        System.out.println(Arrays.toString(myArr));

//        // 자바 변수의 유효 범위 : {}
//        int num = 10;
//        if(num > 1) {
//            int abc = 20;
//            num = 20;
//        }
//        System.out.println(num);        // num은 전역변수이므로 접근 가능
////        System.out.println(abc);       // if문 안에서 정의된 변수abc는 지역변수이므로 접근불가

////        2중 for문을 통해 배열 접근;
//        int[][] arr = {{1,2,3,4}, {5,6,7,8}};
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        라벨문
        loop1:
        for (int i =0; i < 5; i++){
            loop2:
            for (int j = 0; j < 5; j++){
                System.out.println("hello world");
                if (j == 2){
                    break loop1;    //그냥 break; 하는 것과 비교
                }
            }
        }


    }
}
