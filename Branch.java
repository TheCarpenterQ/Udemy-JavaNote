import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customers> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customers>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customers> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String name, double amount){
        if(findCustomer(name) != null){
            System.out.println("Customer already existed");
            return false;
        } else {
            this.customers.add(new Customers(name,amount));
            return true;
        }
    }

    public boolean addTransaction(String name,double amount){
        Customers customers = findCustomer(name);
        if(findCustomer(name) == null){
            System.out.println("Customer not found");
            return false;
        } else {
            customers.addTransaction(amount);
            return true;
        }
    }

    private Customers findCustomer(String name){
        for (int i = 0;i < customers.size();i ++){
            if (this.customers.get(i).getName().equals(name)){
                return this.customers.get(i);
            }
        }
        return null;
    }

}