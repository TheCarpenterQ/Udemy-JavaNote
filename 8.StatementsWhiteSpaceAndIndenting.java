public class Main {

    public static void main(String[] args) {
        int myVariable = 50;  //"myVariable = 50" is the expression,and the entire line is the statement
        myVariable ++;
        myVariable --;
        System.out.println("This is a test");

        System.out.println("This is " +
                "another" +
                "still more.");  //The statement don't have to on the same line.All depend on the semicolon

        int anotherVariable = 50;myVariable --;System.out.println("This is another one");  //it's OK for Java to put on the same line

        //indenting:easy to read
    }
}
