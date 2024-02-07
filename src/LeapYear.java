import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (LeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " not a leap year.");
        }
        scanner.close();
    }
    private static boolean LeapYear(int year) {

        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
