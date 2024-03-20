//Enter any value and the find out if it is number (0-9) or an alphabet or symbol

import java.util.Scanner;

public class Alphabet_or_Symbol {
    public static void main(String[] args) {
        char Value;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any Value");
        Value = scanner.next().charAt(0);

        if (Value >='0' && Value <= '9') {
            System.out.println("It is a Number");

        } else if ((Value >= 'a' && Value <= 'z') || (Value >= 'A' && Value <= 'Z'))
        {
            System.out.println("It is a Alphabet");
        } else {
            System.out.println("It is a Symbol");
        }

    }


}
