package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //function (method usage)
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
        calculateScore(false, 2000, 5, 300);
// method calling
        int score1 = calculateHighScorePosition(1000);
        displayHighScorePosition("Tim" , score1 );

    }
        public static int calculateScore (boolean gameOver, int score, int levelCompeted, int bonus){
            if(gameOver) {
                int finalScore = score + (levelCompeted * bonus);
                finalScore += 1000;
                System.out.println("your final score is" + finalScore);
            }
            return -1;



        }
    public static void displayHighScorePosition(String playerName, int highScorePosition)
    {
        System.out.println( playerName + "managed to get into position"
                + highScorePosition + "on the high score table" );
    }

    public static int calculateHighScorePosition( int playerScore) {
        if ( playerScore > 1000)
            return  1;
        else if ( playerScore > 500 && playerScore < 1000)
            return 2;
        else if ( playerScore > 100 && playerScore < 500)
            return 3;
        else
            return 4;
    }





}
