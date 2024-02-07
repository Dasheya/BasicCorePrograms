import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the divident:");
        int divident=scanner.nextInt();
        System.out.println("Enter the divisor:");
        int divisor=scanner.nextInt();
        int quotient=divident/divisor;
        int remainder=divident%divisor;
        System.out.println("Quotient is:"+quotient);
        System.out.println(("Remainder is:"+remainder));
    }
}
