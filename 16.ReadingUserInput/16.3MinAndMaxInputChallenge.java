import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        boolean first = true;

        while (true){  //the endless loop statement until meet the BREAK
            System.out.println("Enter number:");
            Scanner scanner = new Scanner(System.in);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                scanner.nextLine();
                if (first){
                first = false;
                max = number;
                min = number;
                }
                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
        }
        System.out.println("The minimum number is " + min + " and the maximum number is " + max);
    }
}
