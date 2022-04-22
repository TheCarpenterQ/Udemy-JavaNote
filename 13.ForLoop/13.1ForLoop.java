public class Main {

    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = " + calculateInterest(10000.0,2.0));

        //for (init;termination;increment){}  //basic formula of a FOR statement

        for (int i=0;i<5;i++){
            System.out.println("loop " + i + " hello!");
        }

        //Challenge1:
        for(int i=2;i<9;i++){
            System.out.println("10000 at 2% interest = " + calculateInterest(10000.0,i));
        }

        //Challenge2:
        for (int i=8;i>1;i--){
            System.out.println("10000 at 2% interest = " + calculateInterest(10000.0,i));
        }

    //Challenge3:
        int count = 0;
        for (int i = 10;i < 50;i ++){
            if(isPrime(i)){
                count ++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= (long)Math.sqrt(n); i++){
            System.out.println("Looping " + i);
            if (n % i ==0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount,double interestRate){
        return(amount * interestRate / 100);

    }
}
