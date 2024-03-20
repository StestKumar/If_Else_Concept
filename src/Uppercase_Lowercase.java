//Input any alphabet in uppercase and print it in lowercase

import java.util.Scanner;

public class Uppercase_Lowercase {
    public static void main(String[] args) {
        String Change_Case;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any alphabet = ");

        Change_Case = scanner.next();

        String Result;
        Result = Change_Case.toLowerCase();

        System.out.println(Result);
    }
}
