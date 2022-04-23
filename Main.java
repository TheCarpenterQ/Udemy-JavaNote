public class Main {

    public static void main(String[] args) {
        String numberAsString = "2022.125";
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);  //a wrapper class:Integer/Double...etc
                                                        //parseInt:try to parse the string here into a integer(but only with number
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString);  //20221
        System.out.println(number);  //2023
    }
}