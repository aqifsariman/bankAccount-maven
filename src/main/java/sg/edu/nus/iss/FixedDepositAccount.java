package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount {

    public static double interest = 3.0;
    public static double duration = 6.0;

    public FixedDepositAccount(String accountNo, double balance) {
        super(accountNo, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("No operation.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("No operation.");
    }

    @Override
    public void showAccount() {
        System.out.printf("Account No: %s\nFullname: %s \nBalance: $%.2f\n", this.getAccountNo(), this.getFullName(),
                this.getBalance() * (100 + interest) / 100);
    }

}
