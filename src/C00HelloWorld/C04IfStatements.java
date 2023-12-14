package C00HelloWorld;

import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {

//        비밀번호 => 1234
//        스캐너를 써서 사용자의 input int로 받아서
//        비밀번호와 사용자의 input과 동일하면 문이 열렸습니다.
//        일치하지 않으면 비밀번호가 틀렸습니다.를 출력

        String password = new String();

        password = "1234";

//        도어락키 if문 예제
        Scanner myScan = new Scanner(System.in);
        System.out.println("비밀번호를 입력해주세요");
        String input_password = myScan.nextLine();

        if (password.equals(input_password)) {
            System.out.println("문이 열립니다.");
        } else {
            System.out.println("비밀번호가 일치하지 않습니다.");
        }


//        묵시적 타입변환
//        a : 97, A : 65,
//        사용자에게 알파벳을 아무거나 입력받고, 그 알파벳이 대문자인지 소문자인지 판별
        Scanner myScan2 = new Scanner(System.in);

        System.out.println("알파벳 하나만 입력해주세요");
        char answer = myScan2.nextLine().charAt(0);

        if(answer >= 'A' && answer <= 'Z') {  //묵시적 타입변환
            System.out.println(answer + "는 대문자입니다.");
        } else if (answer >= 'a' && answer <= 'z') { //묵시적 타입변환
            System.out.println(answer + "는 소문자입니다.");
        } else {    //예외 처리
            System.out.println("알파벳 하나만 입력해주세요!(-_-;)");
        }


//        버스카드 예제
//        내 돈이 얼마있는지를 입력
//        버스요금 1500이다.
//        돈이 더 적으면 탑승불가, 돈이 더 ㅁ낳으면 정상처리 출력.
//        도난 여부 boolean 설정(입력X)

        int busFee = 1500;
        boolean isStolen = false;
        Scanner myScan3 = new Scanner(System.in);
        System.out.println("소지하고있는 버스카드의 충전액을 입력하시요.");
        int buscard = myScan3.nextInt();

        myScan3 = new Scanner(System.in);       //개행문자 때문에 한번더 스캐너 선언 필요
        System.out.println("도난카드입니까? 예/아니오로 대답하시오.");
        String qus = myScan3.nextLine();
        if(qus.equals("예")){
            isStolen = true;
        }

        if(buscard >= 1500 && isStolen == false) {
            System.out.println("버스 탑승 처리 되었습니다.");
        } else {
            System.out.println("버스를 탑승 할 수 없습니다.");
        }



//        삼항연산자
//        도어락키 if문 예제
        String answer1 = "0234";
        System.out.println("비밀번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = (answer1.equals(input)) ? "문이 열립니다." : "비밀번호가 틀립니다.";
        System.out.println(result);



//        택시요금 : 10000원 , 버스요금 : 3000원, 킥보드요금 : 2000원 , 걸어가기 : 0원
//        내가 소지한 금액에 맞게 이동수단을 추천하는 if문을 작성하시오.
        Scanner sc2 = new Scanner(System.in);
        System.out.println("현재 소지한 금액을 입력하시요.");
        int myMoney = sc2.nextInt();
        if(myMoney >= 0 && myMoney < 2000) {
            System.out.println("걸어가는 것을 추천합니다.");
        } else if (myMoney >= 2000 && myMoney < 3000) {
            System.out.println("킥보드 타는 것을 추천합니다.");
        } else if (myMoney >= 3000 && myMoney < 10000) {
            System.out.println("버스 타는 것을 추천합니다.");
        } else if (myMoney >= 10000) {
            System.out.println("택시 타는 것을 추천합니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }


//        switch 고객센터 출력 예제
//        원하시는 서비스에 맞는 번호를 입력주세요.
//        1. 대출 서비스입니다.
//        2. 예금
//        3. 적금
//        0. 상담사 연결
//        그외: 잘못 누르셨습니다.

        Scanner sc3 = new Scanner(System.in);
        System.out.println("원하시는 서비스에 맞는 번호를 입력주세요.");
        System.out.println("1. 대출");
        System.out.println("2. 예금");
        System.out.println("3. 적금");
        System.out.println("0. 상담사 연결");
        int select = sc3.nextInt();

        switch (select) {
            case 1:
                System.out.println("대출 서비스를 연결합니다.");
                break;
            case 2:
                System.out.println("예금 서비스를 연결합니다");
                break;
            case 3:
                System.out.println("적금 서비스를 연결합니다.");
                break;
            case 0:
                System.out.println("상담사를 연결합니다.");
                break;
            default:
                System.out.println("잘못 누르셨습니다.");
                break;
        }
    }
}
