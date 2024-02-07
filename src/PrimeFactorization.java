import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the value of N from the user
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();

        // Validate that N is a positive integer
        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Compute and print the prime factorization of N
            System.out.print("Prime factorization of " + N + ": ");
            computePrimeFactorization(N);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to compute the prime factorization of N using brute force
    private static void computePrimeFactorization(int N) {
        // Iterate from 2 to N and find prime factors
        // 4%(divide)2 =0(remainder)
        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                // i is a prime factor of N, print it
                System.out.print(i + " ");

                // Divide N by i to remove this prime factor
                N = N / i;
            }
        }
        System.out.println(); // Move to the next line after printing prime factors
    }
}