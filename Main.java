import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //Scanner:is a built-in class,allows to read user's import
                                                    //new:create a new instance/object of type scanner
                                                    // System.in:allows to type input into the console and return back to the programme
        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt();  //check if the next input is a number
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();  //what has typed is automatically converted into integer
            scanner.nextLine();  //handle next line character (enter key)
            //after reading a number with a scanner,there MUST be a NEXTLINE method call
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();  //to read next line of input from the console
            int age = 2022 - yearOfBirth;

            if (age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ",and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close();  //close the scanner
    }
}