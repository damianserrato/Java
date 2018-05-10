import java.util.Random;

public class BankAccountTest {
    public static void main(String[] args) {

    BankAccount account1 = new BankAccount();
    BankAccount account2 = new BankAccount();
    BankAccount account3 = new BankAccount();

    long acc1 = account1.accNum();
    long acc2 = account2.accNum();
    long acc3 = account3.accNum();

    long deposit1 = account1.depositChecking(100L);
    long deposit2 = account1.depositSavings(250L);
    long withdraw1 = account1.withdrawChecking(250L);

    System.out.println(acc1);
    System.out.println(acc2);
    System.out.println(acc3);
    System.out.println(deposit1);
    System.out.println(deposit2);
    System.out.println(withdraw1);
    }
}