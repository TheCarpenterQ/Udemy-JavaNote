public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted =5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {  //{}is a code block,Java can only process 1 line at a time without it
//            System.out.println("Your score less than 5000 but greater than 1000");
//            System.out.println("This was executed");
//        }else if(score < 1000){
//            System.out.println("Your score was less than 1000");
//        }else{
//            System.out.println("Got here");
//        }
        if (gameOver == true){  //able to access vars created outside of the code block
            int finalScore = score + (levelCompleted + bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

//        int saveFinalScore = finalScore;  //an error here:once the block has finished,it'll automatically delete any vars created in the code block above
//                                          //vars inside a code block is called Scope

        score = 10000;  //not redefining,just change value
        levelCompleted =8;
        bonus = 200;
        if (gameOver == true){  //able to access vars created outside of the code block
            int finalScore = score + (levelCompleted + bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //basic structure of the IF ELSE statement:
//        if(condition){                  //*No SEMICOLON should be added!
//            //if statement (block)
//        } else {
//            //else statement (block)
//        }
    }

}
