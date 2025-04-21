package practiceQuestions.problem3;
public class BankAccount {
    private Long balance = 0L;

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public synchronized void deposit(Long amount){
            balance += amount;
    }

    public synchronized void withdraw(Long amount){
            balance -= amount;
    }
}
