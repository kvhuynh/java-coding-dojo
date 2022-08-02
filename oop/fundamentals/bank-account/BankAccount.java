import java.util.Random;
public class BankAccount {
    private double checkingsBalance;
    private double savingsBalance;
    private String accountNumber;
    private Random rand = new Random();
    private static int totalNumberOfAccounts;
    private static double totalAmountOfMoneyInBank;

    public BankAccount() {
        totalNumberOfAccounts++;
        this.accountNumber = generateAccountNumber();
    }

    // Getter
    public double getCheckingBalance() {
        return this.checkingsBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public static int getTotalNumberOfAccounts() {
        return totalNumberOfAccounts;
    }

    public static double getTotalAmountOfMoneyInBank() {
        return totalAmountOfMoneyInBank;
    }

    // Deposit money
    public void depositIntoChecking(double amount) {
        this.checkingsBalance += amount;
        totalAmountOfMoneyInBank += amount;
    }

    public void depositIntoSaving(double amount) {
        this.savingsBalance += amount;
        totalAmountOfMoneyInBank += amount;
    }

    // Withdraw money
    public void withdrawFromChecking(double amount) {
        if (this.checkingsBalance < amount) {
            System.out.println("You do not have enough funds in your checking account.");
        } else {
            this.checkingsBalance -= amount;
            totalAmountOfMoneyInBank -= amount;
        }
    }

    public void withdrawFromSavings(double amount) {
        if (this.savingsBalance < amount) {
            System.out.println("You do not have enough funds in your savings account.");
        } else {
            this.savingsBalance -= amount;
            totalAmountOfMoneyInBank -= amount;
        }
    }

    public void displayBalances() {
        System.out.println("Checking Account: $" + this.checkingsBalance);
        System.out.println("Savings Account: $" + this.savingsBalance);
        System.out.println("Total Balance: $" + (this.checkingsBalance + this.savingsBalance));
    }

    private String generateAccountNumber() {
        String accountNumber = "";
        for (int i = 0; i < 10; i++ ) {
            accountNumber += rand.nextInt(10);
        }
        return accountNumber;
    }
}