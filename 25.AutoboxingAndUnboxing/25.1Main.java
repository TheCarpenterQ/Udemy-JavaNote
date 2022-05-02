import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("TC");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> IntClassArrayList = new ArrayList<IntClass>();
        IntClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);  //the first Integer is actually a class
        Double  doubleValue = new Double(12.25);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i = 0;i <= 10;i ++){
            integerArrayList.add(Integer.valueOf(i));
            //valueof:auto boxing:convert a base primitive type int to an Integer class
        }
        for(int i = 0;i <= 10;i ++){
            System.out.println(i + ":  " + integerArrayList.get(i).intValue());
            //intValue:Returns the value of this Integer as an int.Unboxing:take it from the class/the object wrapper and convert it back to a primitive type
        }

        //SHORTCUT:
        Integer myIntValue = 56; // equals to:Integer.valueOf(56);
        int myInt = myIntValue;  //:myIntValue.intValue()

        ArrayList<Double> myDoubleValue = new ArrayList<Double>();
        for (double dbl = 0.0;dbl <= 10.0;dbl += 0.5){
            myDoubleValue.add(dbl);  //autoboxing with shortcut
        }
        for (int i = 0;i < myDoubleValue.size();i ++){
            double value = myDoubleValue.get(i);  //unboxing
            System.out.println(i + ":  " + value);
        }

        //Bank Challenge Main:
        Bank bank = new Bank("ABank");
        bank.addBranch("CityA");
        bank.addCustomer("CityA","TC",88888.88);
        bank.addCustomer("CityA","BB",1234.1);

        bank.addBranch("CityB");
        bank.addCustomer("CityB","HM",6666.66);

        bank.addTransaction("CityA","TC",6666.66);

        bank.listCustomers("CityA",true);
    }

}
