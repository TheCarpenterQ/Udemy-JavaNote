public class Hello {

    public static void main(String[] arges){

        System.out.println("Hello World");

        int myFirstNumber = (10 + 5) + (2 * 10);  //声明int类型(primitive data types)
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);  //sout是System.out.println()的快捷写法
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
