import java.util.Random;

public class BankAccount {
    private long accNumber;
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;

    public int getCheckingBalance() {
        return checkingBalance;
    }

    public int getSavingsBalance() {
        return savingsBalance;
    }

    public int accNum() {
        accNumber = rand.nextLong(9999999999) + 1000000000;
        numberOfAccounts ++;
        return accNumber;
    }

    public int depositChecking(amount) {
        this.checkingBalance = this.checkingBalance + amount;
    }
}