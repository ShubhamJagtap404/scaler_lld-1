package practiceQuestions.problem3;

public class Withdraw implements Runnable{
    private BankAccount bankAccount;

    public Withdraw(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            bankAccount.withdraw((long)i);
        }
    }
}
