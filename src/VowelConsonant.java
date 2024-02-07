//Java Program to Check Whether an Alphabet is Vowel or Consonant
//Vowel:Vowel sounds include 'a,' 'e,' 'i,' 'o,' 'u,' and the various combinations
//Consonant:Consonant sounds include 'b,' 'c,' 'd,' 'f,' 's,' and the various combinations
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] argu){


                Scanner scanner = new Scanner(System.in);

                // Get a single alphabet from the user
                System.out.print("Enter a single alphabet: ");
                char alphabet = scanner.next().charAt(0);

                // Check if the entered character is a letter
                if (Character.isLetter(alphabet)) {
                    // Convert the alphabet to lowercase for easier comparison
                    char lowercaseAlphabet = Character.toLowerCase(alphabet);

                    // Check if the alphabet is a vowel or a consonant
                    if (isVowel(lowercaseAlphabet)) {
                        System.out.println(alphabet + " is a vowel.");
                    } else {
                        System.out.println(alphabet + " is a consonant.");
                    }
                } else {
                    System.out.println("Please enter a valid alphabet.");
                }

                // Close the scanner
                scanner.close();
            }

            // Function to check if a character is a vowel
            private static boolean isVowel(char ch) {
                return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
            }
        }
