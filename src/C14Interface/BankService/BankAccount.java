package C14Interface.BankService;

public class BankAccount {
    private String account_number;  //계좌번호
    private long balance;     //잔고

    BankAccount(String accountNumber, long balance){
        this.account_number = accountNumber;
        this.balance = balance;
    }

    public String getAccount_number() {
        return account_number;
    }

    public long getBalance(){
        return this.balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
