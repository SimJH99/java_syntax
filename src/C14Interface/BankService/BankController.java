package C14Interface.BankService;

//BankController 클래스 : 사용자 요청 처리
//BankService 인터페이스
//Bankservice 구현체: BankcardService, BankKaKaopayService
//BankAccount 엔티티

public class BankController {
    public static void main(String[] args) {
        BankAccount sim = new BankAccount("123456", 10000);

        BankService kakao = new BankKakaopayService();
        BankService card = new BankCardService();

        kakao.deposit(sim, 3000);
        kakao.withDraw(sim, 3000);
        card.deposit(sim, 300000);
        card.withDraw(sim, 100000);
    }
}