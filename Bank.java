import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        if(findBranch(name) != null){
            System.out.println("Branch already existed");
            return false;
        } else {
            this.branches.add(new Branch(name));
            return true;
        }
    }

    public boolean addCustomer(String branchName,String customerName,double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addTransaction(String branchName,String customerName,double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addTransaction(customerName,amount);
        }
        return false;
    }

    private Branch findBranch(String name){
        for (int i = 0;i < branches.size();i ++){
            if (this.branches.get(i).getName().equals(name)){
                return this.branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName,boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customers for branch " + branchName);

            ArrayList<Customers> branchCustomers = branch.getCustomers();
            for (int i = 0;i < branchCustomers.size();i ++){
                Customers branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + (i+1) + " " + branchCustomer.getName());
                if (showTransactions == true){
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0;j < transactions.size();j ++){
                        System.out.println( (j+1) + " " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }


}
