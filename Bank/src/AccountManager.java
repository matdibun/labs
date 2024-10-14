public class AccountManager {
    public static void main(String[] args) {
        BankAccount tester = new BankAccount(0);
        System.out.println("잔액 = " + tester.getBalance());

        int five = 50000;
        int three = 30000;

        if (tester.deposit(five))
            System.out.println(five + " 원 입금 성공 : 잔액 = " + tester.getBalance());
        else
            System.out.println(five + " 원 입금 실패 : 잔액 = " + tester.getBalance());

        if (tester.withdraw(three))
            System.out.println(three + " 원 출금 성공 : 잔액 = " + tester.getBalance());
        else
            System.out.println(three + " 원 출금 실패 : 잔액 = " + tester.getBalance());

        if (tester.withdraw(three))
            System.out.println(three + " 원 출금 성공 : 잔액 = " + tester.getBalance());
        else
            System.out.println(three + " 원 출금 실패 : 잔액 = " + tester.getBalance());
    }

}
