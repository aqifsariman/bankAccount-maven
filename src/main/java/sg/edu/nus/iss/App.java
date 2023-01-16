package sg.edu.nus.iss;

import java.util.Random;
import java.util.UUID;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */

    public static void main(String[] args) {

        System.out.println("Welcome to banking!");

        int n = 3;
        BankAccount bankAccount[] = new BankAccount[n];
        String[] accountNames = { "Bob", "Jim", "Fred" };

        for (int i = 0; i < bankAccount.length; i++) {
            String uuid = UUID.randomUUID().toString();

            double max = 10000.00;
            double min = 1000.00;

            Random randomNum = new Random();
            double initialBalance = min + randomNum.nextDouble();
            bankAccount[i] = new FixedDepositAccount(uuid, initialBalance);
        }

        for (int j = 0; j < bankAccount.length; j++) {
            bankAccount[j].setFullName(accountNames[j]);
            bankAccount[j].deposit(1000);
            bankAccount[j].withdraw(7000);
            bankAccount[j].showAccount();
        }
    }
}
