import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("110");

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: " );
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printMyContacts();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    updateContacts();
                    break;
                case 4:
                    removeContacts();
                    break;
                case 5:
                    queryContacts();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }
    private static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - choice options");
        System.out.println("\t 1 - print contacts list");
        System.out.println("\t 2 - add a contact");
        System.out.println("\t 3 - update");
        System.out.println("\t 4 - remove");
        System.out.println("\t 5 - search");
        System.out.println("\t 6 - quit");
    }

    public static void addContacts(){
        System.out.print("Please enter contact name:");
        String addName = scanner.nextLine();
        System.out.print("Please enter contact number:");
        String addNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(addNumber,addName);
        if (mobilePhone.addContacts(newContact)){
            System.out.println("New contact added: Name = " + addName + ", Number = " + addNumber);
        } else {
            System.out.println("Contact already on file");
        }
    }

    public static void updateContacts(){
        System.out.print("Current contact name: ");
        String name = scanner.nextLine();
        Contacts oldContact = mobilePhone.queryContact(name);
        if (oldContact == null){
            System.out.println("Contact not found");
        }
        System.out.print("Enter current contact name:");
        String newName = scanner.nextLine();
        System.out.print("Enter current contact number:");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newNumber,newName);
        if (mobilePhone.updateContacts(oldContact,newContact)){
            System.out.println("Successfully updated");
        } else {
            System.out.println("error");
        }
    }

    public static void removeContacts(){
        System.out.print("Current contact name: ");
        String name = scanner.nextLine();
        Contacts oldContact = mobilePhone.queryContact(name);
        if (oldContact == null){
            System.out.println("Contact not found");
        }
        if (mobilePhone.removeContacts(oldContact)){
            System.out.println("Successfully removed");
        } else {
            System.out.println("error");
        }
    }

    public static void queryContacts(){
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        Contacts oldContact = mobilePhone.queryContact(name);
        if (oldContact == null){
            System.out.println("Contact not found");
        } else {
            System.out.println("Name:" + oldContact.getName() + ", Number:" + oldContact.getNumber());
        }
    }


}