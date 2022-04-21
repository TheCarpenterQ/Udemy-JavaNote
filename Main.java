public class Main {

    public static void main(String[] args) {  //A method called MAIN
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        int highScore = calculateScore(true,800,5,100);  //could assign a var to a method result
        System.out.println("Your final score was " + highScore);
//        if(gameOver){
//            int finalScore = score + (levelComplete * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }

        score = 10000;
        levelComplete = 8;
        bonus = 200;
        highScore = calculateScore(true,10000,8,200);
        System.out.println("Your final score was " + highScore);

//        if (gameOver){
//            int finalScore = score + (levelComplete * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }



    //----------Challenge:
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("TheCarpenter",position);
    }

    public static void displayHighScorePosition(String playersName,int position){
        System.out.println(playersName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
            return 4;
    }
    //----------

    //Create a new method,but still in the public class:
    //use the terms:public,static,void
    public static int calculateScore(boolean gameOver,int score,int levelComplete,int bonus){  //has to be sent four parameters
//        boolean gameOver = true;  //ERROR here:defined parameters already,then don't have to create in the method again
//        int score = 800;
//        int levelComplete = 5;
//        int bonus = 100;

        if(gameOver){
            int finalScore = score + (levelComplete * bonus);
            finalScore += 1000;
            return finalScore;
        }else{
            return -1;  //-1 means:value not found
        }
    }

}

