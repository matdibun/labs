import javax.swing.*;

public class BankAccount {
    private int balance;
    public BankAccount(int initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        }else {
            balance = 0;
        }
    }
    boolean deposit(int amount) {
        boolean success = false;
        if (amount >= 0) {
            balance = balance + amount;
            success = true;
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Amount");
        }
        return success;
    }
    boolean withdraw(int amount) {
        boolean success = false;
        if (amount < 0) {
            JOptionPane.showMessageDialog(null, "Invalid Amount");
        } else if (amount > balance) {
            JOptionPane.showMessageDialog(null, "Not enough balance");
        }else {
            balance = balance - amount;
            success = true;
        }
        return success;
    }
    public int getBalance() {
        return balance;
    }


}
