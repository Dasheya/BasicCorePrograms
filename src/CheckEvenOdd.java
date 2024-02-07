import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] argu){
        //if(num/2 and remainder=0 num=even
        //else num=odd
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number:");
        int number=scanner.nextInt();
        if (number % 2 == 0)//logic is if number is divisible by 2 that means it is even
            {
            System.out.println("Enter number is even");
        }
            else{
                System.out.println("Number is odd");
            }
        }
    }
