package C14Interface.BankService;

public class BankCardService implements BankService{
    @Override
    public void deposit(BankAccount name, long money) {
        name.setBalance(name.getBalance() + money);
        System.out.println("카드로 " + money + "원 입금되었습니다.");
    }

    @Override
    public void withDraw(BankAccount name, long money) {
        if (name.getBalance() >= money) {
            name.setBalance(name.getBalance() - money);
            System.out.println("카드로 " + money + "원 출금되었습니다.");
        } else {
            System.out.println("계좌 잔고가 부족합니다.");
        }
    }
}
