public class AccountController {
    private BankAccount account;
    private BankReader reader;
    private BankWriter writer;
    public AccountController(BankReader r, BankWriter w, BankAccount a) {
        reader = r;
        writer = w;
        account = a;
    }

    public void processTransaction() {
        char command  = reader.readCommand("Deposit D, Withdraw W, Exit Q");
        if (command == 'D') {
            writer.showTransaction("Service End");
            return;
        }else if (command == 'D') {
            int amount = reader.readAmount();
            if (account.deposit(amount)) {
                writer.showTransaction(amount, "Deposite Success");
            }else{
                writer.showTransaction("Deposite Failed");
            }
        }else if (command == 'W') {
            int amount = reader.readAmount();
            if (account.withdraw(amount)) {
                writer.showTransaction(amount, "Withdraw Success");
            }else {
                writer.showTransaction("Withdraw Failed");
            }
        }else{
            writer.showTransaction("Error");
        }
        this.processTransaction();
    }
}
