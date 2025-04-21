package practiceQuestions.problem3;

import java.util.Vector;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount();
        Withdraw withdraw = new Withdraw(bankAccount);
        Deposit deposit = new Deposit(bankAccount);

        Thread t1 = new Thread(withdraw);
        Thread t2 = new Thread(deposit);

        t2.start();
        t1.start();

        t1.join();
        t2.join();

        System.out.println("Final amount in bank = " + bankAccount.getBalance());

    }
}
