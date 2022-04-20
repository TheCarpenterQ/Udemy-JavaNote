public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;  //1+2=3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);  //3
        result = result - 1;  //3-1=2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);  //3

        result = result * 10;  //2*10=20
        System.out.println("2 * 10 = " + result);  //20

        result = result / 5;  //20/5=4
        System.out.println("20 / 5 = " + result);  //4

        result = result % 3;  //mod,the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);  //1

        // result = result + 1
        result++;  //1 + 1 = 2.it's a shorthand way of writing
        System.out.println("1 + 1 = " + result);

        result--;  // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2;
        result += 2;  //1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10;  //3 * 10 = 30
        System.out.println("3 * 10= " + result);

        //result = result / 3;
        result /= 3;  //30 / 3 = 10
        System.out.println("30 / 3= " + result);

        //result = result - 2;
        result -= 2;  //10 - 2 = 8
        System.out.println("0 - 2= " + result);


        //If-then statement:
        // *if do not use code block,then only one line of code can be added.
        boolean isAlien = false;  //Single equal:assignment operator
        if (isAlien == false) { //Two equals.If statement does not have a semicolon.Actually are multiple lines.
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore != 100){  //!=:not equal; >:the greater than operator; <:the less than operator; >=:greater than or equal to
            System.out.println("You got the high score!");
        }
        //AND &&:
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){  //&&:2 ampersands means a logical AND operator,ensures both operands are true
            System.out.println("Greater than second top score and less than 100");
        }
        //OR ||:
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the condition are true");
        }


        //Challenge (operator):What's the wrong with this code?
        /*int newValue = 50;
        if (newValue = 50){  //should be 2 equals(equal to operator),but not an assignment operator
            System.out.println("This is an error");
        }*/

        boolean isCar = false;  //What is going to happen?
        if (isCar = true){  //No error here,but should be use the equal to operator
                            //(isCar = true) can be shortcut as (isCar)
                            //(isCar != true) shortcut as (!isCar):the NOT operator
            System.out.println("This is not supposed to happen");
        }

        //Ternary operator:  condition ? true : false
        isCar = true;
        boolean wasCar = isCar ? true : false;
        //1st:the condition;2td:the value to assign to wasCar if 1st is true;3rd:the value to assign to wasCar if 1st is false
        if (wasCar){
            System.out.println("wasCar is true");
        }

        //Operator Challenge:operator precedence
        double double1 = 20d;
        double double2 = 80d;
        double total = (double1 + double2) * 100d;
        double remainder = total % 40d;
        boolean isTrue = (remainder == 0) ? true : false;
        System.out.println("The result is " + isTrue);
        if (!isTrue){
            System.out.println("Got some remainder");
        }
    }
}