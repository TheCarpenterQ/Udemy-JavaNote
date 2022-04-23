public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits is" + sumDigits(1569));
    }

    public static int sumDigits(int number){
        int sum = 0;
        if (number >= 10){
            while (number != 0){
                int remain = number % 10;
                sum += remain;
                number = number / 10;
            }
            return sum;
        }
        return -1;
    }
}