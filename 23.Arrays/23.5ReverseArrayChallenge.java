import java.util.Scanner;

public class ReverseArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int nonReversedArray[] = getArray(5);
        int reversedArray[] = reverse(nonReversedArray);
        for(int i = 0;i < reversedArray.length;i ++){
            System.out.println("Reversed Array Elements " + i + ",typed value was " + reversedArray[i]);
        }
    }

    private static int[] getArray(int number) {
        System.out.println("Enter " + number + " integer values.\r");  // \r:automatically go to the next line
        int[] values = new int[number];
        for (int i = 0;i < values.length;i ++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static int[] reverse(int[] array) {
        int reverse[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[i];
        }
        int temp;
        for (int i = 0; i < (reverse.length / 2 ) ; i++){
            temp = reverse[i];
            reverse[i] = reverse[reverse.length - (i + 1)];
            reverse[reverse.length - (i + 1)] = temp;
        }
    return reverse;
    }

}


