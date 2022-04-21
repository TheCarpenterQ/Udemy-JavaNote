public class Main {  //code to test

    public static void main(String[] args) {  //shortcut:PSVM.Which is a standard entry point

        long miles = SpeedConverter.toMilesPerHour(10.5);  //call CLASS.METHOD:same as when called the round method
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);
    }
}
