public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value ==1 ){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue){  //SWITCH statement.Similar to IF,but IF is more flexible.
                                //able to use:byte\short\char\int\string……etc
            case 1:  //testing for the value 1
                System.out.println("Value was 1");
                break;  //enclosing the SWITCH statement
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:  //a shortcut for SWITCH
                System.out.println("was a 3,or a 4,or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:  //else
                System.out.println("Value was not 1 or 2");
                break;
        }

        //Challenge:
        char charValue = 'A' ;

        switch (charValue){
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':case 'D':case 'E':
                System.out.println("Value was " + charValue);
                break;
            default:
                System.out.println("Could not find A,B,C,D or E");
                break;
        }

    }
}
