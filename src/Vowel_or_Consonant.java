//Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel or Consonant, depending on the user input.
//For eg:
//Input an alphabet: p
//Expected Output :
//Input letter is Consonant

import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        char Character;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character from alphabets = ");
        Character = scanner.next().charAt(0);

        if (Character == 'a' || Character == 'A') {
            System.out.println("Character is a Vowel");
        } else if (Character == 'e' || Character == 'E') {
            System.out.println("Character is a Vowel");
        } else if (Character == 'i' || Character == 'I') {
            System.out.println("Character is a Vowel");
        } else if (Character == 'o' || Character == 'O') {
            System.out.println("Character is a Vowel");
        } else if (Character == 'u' || Character == 'U') {
            System.out.println("Character is a Vowel");
        } else {
            System.out.println("Character is a Consonant");
        }
    }
}
