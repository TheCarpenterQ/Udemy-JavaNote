public class BankAccount {

    private String accountNumber;
    private double balance = 500;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber,double balance,String customerName,String email,String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;  //saving the value directly rather than calling setters
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
        System.out.println("The new balance is " + balance);
    }

    public void withdrawal(double withdrawalAmount){
        if (balance - withdrawalAmount < 0){
            System.out.println("They are insufficient funds.Not allowed to complete.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("The new balance is " + balance);
        }
    }


    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email= email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


}
