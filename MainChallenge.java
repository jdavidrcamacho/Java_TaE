public class MainChallenge {
    public static void main(String[] args) {

        int highScore;

        highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Final score: " + highScore);
        
        System.out.println("Final score: " + 
                calculateScore(true, 10000, 8, 200));
    }

    public static int calculateScore(boolean gaveOver, int score,
            int levelCompleted, int bonus) {

        int finalScore = score;

        if (gaveOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            
        }
        return finalScore;
    }
}
