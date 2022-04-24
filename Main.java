public class Main {

    public static void main(String[] args) {
    VIPCustomer VIP = new VIPCustomer("TC",50000.00);
    System.out.println(VIP.getName());

    VIPCustomer VIP2 = new VIPCustomer();
    System.out.println(VIP2.getName());

    VIPCustomer VIP3 = new VIPCustomer("CT",50000.00,"987654@gmail.com");
    System.out.println(VIP3.getName());
    }
}