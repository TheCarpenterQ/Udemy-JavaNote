import java.util.Scanner;

public class Challenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int myInteger[] = getIntegers(5);
        int mySortArray[] = sortIntegers(myInteger);
        printArrays(mySortArray);

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");  // \r:automatically go to the next line
        int[] values = new int[number];
        for (int i = 0;i < values.length;i ++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArrays(int[] array){
        for (int i = 0;i < array.length;i ++) {
            System.out.println("Elements " + i + ",typed value was " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sort = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sort[i] = array[i];
        }
        int temp;
        boolean flag = true;  //need to flag if need to go through and check again
        while (flag){
            flag = false;
            for (int i = 0; i < sort.length-1; i++) {
                if (sort[i] < sort[i + 1]){
                temp = sort[i];
                sort[i] = sort[i + 1];
                sort[i + 1] = temp;
                flag = true;
                }
            }
        }
        return sort;
    }

}
