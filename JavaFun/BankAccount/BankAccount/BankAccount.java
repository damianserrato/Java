import java.util.Random;

public class BankAccount {
    private long accNumber;
    private long checkingBalance;
    private long savingsBalance;
    public static long numberOfAccounts = 0;

    public long getCheckingBalance() {
        return checkingBalance;
    }

    public long getSavingsBalance() {
        return savingsBalance;
    }

    public long depositChecking(Long amount) {
        this.checkingBalance = this.checkingBalance + amount;
        return this.checkingBalance;
    }

    public long depositSavings(Long amount) {
        this.savingsBalance = this.savingsBalance + amount;
        return this.savingsBalance;
    }

    public Long accNum() {
        accNumber = (long) + Math.floor( Math.random() * 9999999999L);
        numberOfAccounts ++;
        System.out.println(numberOfAccounts);
        return accNumber;
    }

    public long withdrawChecking(long amount) {
        if (this.checkingBalance == 0) {
            System.out.println("Sorry, insuficient funds");
        }
        this.checkingBalance = this.checkingBalance - amount;
        return this.checkingBalance;
    }

}