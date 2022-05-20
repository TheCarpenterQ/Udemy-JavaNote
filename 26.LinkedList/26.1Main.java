import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("TC",54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;  //set the value of this class to the first project
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + "is " + customer.getBalance());
        //print out the value of the 1st class
        //result:12.18 cause:the 2nd class we created actually pointing to the 1st class
        //when we use the set method on the 2nd class,it actually updated the 1st class.

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i=0;i<intList.size();i ++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,2);
        //add "2" on the 1 position.the other entries moved down.
        //but for LinkList,don't need to move anything if you want to insert value
        for (int i=0;i<intList.size();i ++){
            System.out.println(i + ": " + intList.get(i));
        }

    }
}
