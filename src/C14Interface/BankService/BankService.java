package C14Interface.BankService;

public interface BankService {
    void deposit(BankAccount bankAccount, long money);

    void withDraw(BankAccount bankAccount, long money);
}
