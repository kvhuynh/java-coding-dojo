public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount();
        System.out.println("Account Number " + bank1.getAccountNumber());
        bank1.depositIntoChecking(20.00);
        bank1.depositIntoSaving(50.00);
        bank1.displayBalances();
        System.out.println();
        BankAccount bank2 = new BankAccount();
        System.out.println("Account Number " + bank2.getAccountNumber());
        bank2.depositIntoChecking(50.00);
        bank2.depositIntoSaving(50.00);
        bank2.displayBalances();

        System.out.println();
        System.out.println(BankAccount.getTotalNumberOfAccounts());
        System.out.println(BankAccount.getTotalAmountOfMoneyInBank());

        bank1.withdrawFromChecking(30);
        bank1.withdrawFromSavings(60);
        bank1.withdrawFromChecking(20);
        bank1.withdrawFromSavings(50);

        System.out.println();
        System.out.println(BankAccount.getTotalNumberOfAccounts());
        System.out.println(BankAccount.getTotalAmountOfMoneyInBank());


    }

}
