public class Main {

    public static void main(String[] args) {
        BankAccount TCAccount = new BankAccount("12345",0.00,"TC","123456@outlook.cn","123456");
        System.out.println(TCAccount.getAccountNumber());

        TCAccount.deposit(200);
        TCAccount.withdrawal(500);
    }
}
