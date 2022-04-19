public class Main {
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;  //convert myInt to a String then appends it to the 10
        System.out.println("LastString is equal to " + lastString);  //print 1050
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;  //A new String is created instead of being changed(strings in Java are immutable
        System.out.println("LastString is equal to " + lastString);  //print 1050120.47
    }
}
