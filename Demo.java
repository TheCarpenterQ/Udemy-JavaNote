import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();
        //very similar to an array
        addInOrder(placeToVisit,"B");
        addInOrder(placeToVisit,"A");
        addInOrder(placeToVisit,"D");
        addInOrder(placeToVisit,"C");

//        placeToVisit.add("A");
//        placeToVisit.add("B");
//        placeToVisit.add("C");

        printList(placeToVisit);

        visit(placeToVisit);

        addInOrder(placeToVisit,"G");

        placeToVisit.add(1,"F");
        printList(placeToVisit);

        placeToVisit.remove(1);
        printList(placeToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator();  //iterator:an internal method
        while(i.hasNext()){  //while linkedlist is pointing to sth else/one more record to actually visit
            System.out.println("Now visiting " +i.next());  //i.next:change the value of the iterator
        }
        System.out.println("================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        //ListIterator:can go back to a previous record(diff from the regular iterator
        while(stringListIterator.hasNext()){
            //when define the Iterator,it hasn't move to the first record
            //so must use .next() to go to the first record
            int comparison = stringListIterator.next().compareTo(newCity);
            //0:means they are actually matched.if the value in the linkedlist of the current index entry is equal to the newCity,than it gives 0
            if(comparison == 0){
                //equal:do not add
                System.out.println(newCity + " is already included");
                return false;
            } else if(comparison > 0){
                //new city should appear before this one
                //need to back to the previous entry
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0){
                //move on to the next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;  //to track the direction
        ListIterator<String> ListIterator = cities.listIterator();

        if (cities.isEmpty()){  //to check if it is empty
        } else {
            System.out.println("Now visiting " + ListIterator.next());
            printmenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward){  //if the user has previously selected going back
                        if (ListIterator.hasNext()){
                            ListIterator.next();
                            goingForward = true;
                        }
                        goingForward = true;
                    }
                    if (ListIterator.hasNext()) {
                        System.out.println("Now visiting " + ListIterator.next());
                    } else {
                        System.out.println("Reach the last city of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (ListIterator.hasPrevious()){
                            ListIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (ListIterator.hasPrevious()){
                        System.out.println("Now visiting " + ListIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;  //forward is the only direction can go now
                    }
                    break;
                case 3:
                    printmenu();
                    break;
            }
        }
    }

    private static void printmenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 = to quit\n" +
                "1 = to next city\n" +
                "2 = to previous city\n" +
                "3 = print menu options");
    }
}
