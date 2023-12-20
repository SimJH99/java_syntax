package C14Interface.BankService;

public class BankKakaopayService implements BankService{
    @Override
    public void deposit(BankAccount bankAccount, long money) {
        bankAccount.setBalance(bankAccount.getBalance() + money);
        System.out.println("카카오페이로 " + money + "원 입금되었습니다.");
    }

    @Override
    public void withDraw(BankAccount bankAccount, long money) {
        if (bankAccount.getBalance() >= money) {
            bankAccount.setBalance(bankAccount.getBalance() - money);
            System.out.println("카카오페이로 " + money + "원 출금되었습니다.");
        } else {
            System.out.println("계좌 잔고가 부족합니다.");
        }
    }
}
