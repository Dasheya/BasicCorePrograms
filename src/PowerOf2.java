import java.util.Scanner;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for powers of 2: ");
        int limit = scanner.nextInt();
        System.out.println("Enter number " + limit );
        for (int i = 0; i <= limit; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
        scanner.close();
    }
}
