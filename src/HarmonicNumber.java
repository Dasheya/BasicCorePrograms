import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the value of N from the user
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Validate that N is greater than 0
        if (N <= 0) {
            System.out.println("Please enter a positive integer for N.");
        } else {
            // Calculate and print the Nth harmonic number
            double harmonicNumber = calculateHarmonicNumber(N);
            System.out.printf("The %dth harmonic number is: %.6f%n", N, harmonicNumber);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to calculate the Nth harmonic number
    private static double calculateHarmonicNumber(int N) {
        double harmonicNumber = 0.0;

        for (int i = 1; i <= N; i++) {
            harmonicNumber += 1.0 / i;
        }

        return harmonicNumber;
    }
}
