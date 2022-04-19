public class Main {
    public static void main(String[] args) {
        //Single precision occupies 32 bits
        //Double precision occupies 64 bits
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;  //Double faster than Float
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        int myIntValue2 = 5 / 3;
        float myFloatValue1 = 5.25f;  //"f"make it clearer
        float myFloatValue2 = (float) 5.25;  //if remove the "f" and it assumed to be a double,then require a float:need to use a cast
        float myFloatValue3 = 5f;
        float myFloatValue4 = 5f / 2;
        float myFloatValue5 = 5f / 3;
        double myDoubleValue1 = 5.25d;
        double myDoubleValue2 = 5d;
        double myDoubleValue3 = 5d / 2;
        double myDoubleValue4 = 5d / 3;  //=5.00 / 3.00
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue3);  //print:5.0
        System.out.println("MyDoubleValue= " + myDoubleValue2);  //print:5.0
        System.out.println("MyIntValue= " + myIntValue);  //print:2
        System.out.println("MyFloatValue= " + myFloatValue4);  //print:2.5
        System.out.println("MyDoubleValue= " + myDoubleValue3);  //print:2.5
        System.out.println("MyIntValue= " + myIntValue2);  //print:1
        System.out.println("MyFloatValue= " + myFloatValue5);  //print:1.6666666  (precision is 7
        System.out.println("MyDoubleValue= " + myDoubleValue4);  //print:1.6666666666666667  (precision is 16

        //Challenge:
        double Pounds = 100d;
        double Kilograms = Pounds * 0.45359237d;
        System.out.println(Kilograms);
    }
}
