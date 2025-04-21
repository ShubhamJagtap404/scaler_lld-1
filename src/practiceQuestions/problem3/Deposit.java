package practiceQuestions.problem3;

public class Deposit implements Runnable{
    private BankAccount bankAccount;

    public Deposit(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            bankAccount.deposit((long)i);
        }
    }
}
