public class Main {
        //ARRAYS:a data structure that allows to store sequence of values of the same types
    public static void main(String[] args) {
        int[] myIntArray = new int[10];//{1,2,3,4,5,6,7,8,9,10};  //define an array and put the number of elements into it
//        myIntArray[0] = 45;
//        myIntArray[1] = 476;
//        myIntArray[5] = 50;  //save "50" into the element 6:always start count at position 0
        for (int i = 0;i < myIntArray.length;i ++){  //.length give the length of the array
            myIntArray[i] = i*10;
        }
        double[] myDoubleVar = new double[10];
        printArray(myIntArray);
    }
    public static void printArray(int[] array){
        for (int i = 0;i < array.length;i ++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
