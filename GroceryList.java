import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();
    //create an arraylist(actually is a class) with the type of String

    //build and add:
    public void addGroceryItem(String item){
        groceryList.add(item);  //add item into the arraylist

    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        //SIZE method:know how many is in there and return the number
        for (int i=0;i< groceryList.size(); i++){
            System.out.println((i+1) + "." + groceryList.get(i));
            //GET method:to access a particular element
        }
    }

    //modify:
    public void modifyGroceryItem(String currentItem,String newItem){
        int position = findItem(currentItem);
        if (position >= 0){
            modifyGroceryItem(position,newItem);
        }
    }

    private void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + (position + 1) + "has been modified.");
    }

    //remove:
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    //query:
    private Integer findItem(String searchItem){
        return groceryList.indexOf(searchItem);
        //INDEXOF:search the arraylist and find the item and return the index position(if not contain:return -1
    }

    public boolean onFile(String searchItem){  //check if it is really here
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
    }
}
