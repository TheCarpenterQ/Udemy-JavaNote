public class Main {

//    while (condition) {
//        statements
//    }

//    do {
//        statements
//    } while (condition):

//    can interrupt the loop by using a CONTINUE and/or a BREAK statement

    public static void main(String[] args) {
        int count = 0;
        while (count != 5){  //Also can be written in FOR statement
            System.out.println("Count value is " + count);
            count ++;
        }

        count = 1;
        while (true){
            if (count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count ++;
        }

        count = 1;
        do {  //DO-WHILE statement
            System.out.println("Count value is " + count);
            count ++;
            if (count > 100){
                break;
            }
        }while (count != 6);


    //Challenge:
        int number = 10;
        int finishNumber = 20;
        int countEven = 0;

        while (number <= finishNumber){
            if (isEvenNumber(number) == true){
                System.out.println("Number " + number + " is an even number.");
                countEven ++;
                if (countEven == 5) {
                    break;
                }
            }
            number ++;
        }
        System.out.println("The total number of even number is " + countEven);
    }

    public static boolean isEvenNumber(int n){
        if (n % 2 == 0){
            return true;
        }
        return false;
    }
}
