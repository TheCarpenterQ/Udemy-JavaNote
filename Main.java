import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  //ArrayList:is a resizable list,handle the resizing automatically
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

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
            groceryList.printGroceryList();
            break;
          case 2:
            addItem();
            break;
          case 3:
            modifyItem();
            break;
          case 4:
            removeItem();
            break;
          case 5:
            searchItem();
            break;
          case 6:
            processArrayList();
            break;
          case 7:
            quit = true;
            break;
        }
      }
  }

    private static void printInstructions(){
      System.out.println("\nPress ");
      System.out.println("\t 0 - choice options");
      System.out.println("\t 1 - print list");
      System.out.println("\t 2 - add an item");
      System.out.println("\t 3 - modify");
      System.out.println("\t 4 - remove");
      System.out.println("\t 5 - search");
      System.out.println("\t 6 - quit");
    }

    public static void addItem(){
      System.out.print("Please enter the grocery item:");
      groceryList.addGroceryItem(scanner.nextLine());
    }
      //diff between PRINTLN and PRINT:PRINTLN'll print in the next line and PRINT print in the same line
    public static void modifyItem(){
      System.out.print("Current item name: ");
      String itemNo = scanner.nextLine();
      System.out.print("Enter replacement item: ");
      String newItem = scanner.nextLine();
      groceryList.modifyGroceryItem(itemNo,newItem );
    }

    public static void removeItem(){
      System.out.print("Enter item number: ");
      String itemNo = scanner.nextLine();
      groceryList.removeGroceryItem(itemNo);
    }

    private static void searchItem(){
      System.out.print("Enter to search for: ");
      String searchItem = scanner.nextLine();
      if (groceryList.onFile(searchItem)){
        System.out.println("Found " + searchItem + " in our grocery list");
      } else {
        System.out.println(searchItem + " is not in the shopping list");
      }
    }

    //3 ways to process an arraylist:
    public static void processArrayList(){
      ArrayList<String> newArray = new ArrayList<String>();
      newArray.addAll(groceryList.getGroceryList());
      //addAll:take contents that are in the groceryList

      ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
      //another way:initialized to the contents of this array list

      String[] myArray = new String[groceryList.getGroceryList().size()];
      //initialize into the right size
      myArray = groceryList.getGroceryList().toArray(myArray);
      //toArray:turn an object in array format
    }

}