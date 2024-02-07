// Java Program to Find the Largest Among Three Numbers
    public class LargestNumber {
    public static void main(String[] argu) {
        int[] array = {22, 33, 77};
        int a=array[0];
        int b=array[1];
        int c=array[2];
        if (a >= b && a >= c) {
            System.out.println("Largest number is:"+a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is:"+b);
        } else {
            System.out.println("Largest number is:"+c);
        }
    }
}