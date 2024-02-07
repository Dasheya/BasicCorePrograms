import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        int numberOfFlips = 100;
        int headsCount = 0;
        int tailsCount = 0;

        Random random = new Random();
        for (int i = 0; i < numberOfFlips; i++) {
            if (random.nextBoolean()) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }
        double headsPercentage = (double) headsCount / numberOfFlips * 100;
        double tailsPercentage = (double) tailsCount / numberOfFlips * 100;

        System.out.println("Total number of flips: " + numberOfFlips);
        System.out.println("Heads: " + headsCount );
        System.out.println("Tails: " + tailsCount );
        System.out.println("Heads Percentage:"+headsPercentage);
        System.out.println("Tails Percentage:"+tailsPercentage);
    }
}