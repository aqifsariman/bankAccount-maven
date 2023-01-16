package sg.edu.nus.iss;

import java.text.DecimalFormat;
import java.util.Date;

public class BankAccount {
    private final String accountNo;
    private String fullName;
    private double balance = 0.0;
    private boolean isActive = true;
    private Date startDate;
    private Date endDate;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void showAccount() {
        System.out.printf("Account No: %s\nFullname: %s \nBalance: $%.2f\n", this.accountNo, this.fullName,
                this.balance);
    }

    @Override
    public String toString() {
        return "BankAccount [accountNo=" + accountNo + ", fullName=" + fullName + ", balance=" + balance + ", isActive="
                + isActive + ", startDate=" + startDate + ", endDate=" + endDate + "]";
    }

    public void deposit(double amount) {
        if (!isActive) {
            throw new IllegalArgumentException("You cannot deposit to a closed account.");
        }

        if (amount < 0) {
            throw new IllegalArgumentException("You cannot deposit less than $0.00.");
        }

        else {
            this.balance += amount;
        }

    }

    public void withdraw(double amount) {
        if (!isActive) {
            throw new IllegalArgumentException("You cannot deposit to a closed account.");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("You cannot deposit less than $0.00.");
        }

        if (amount > this.balance) {
            throw new IllegalArgumentException(
                    "You cannot withdraw more than your account balance of $" + df.format(this.balance));
        }

        else {
            this.balance -= amount;
        }

    }

}
