
//WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find addition,
//subtraction, multiplication and division according to their symbol (using if else)

import java.util.Scanner;

public class Find_Result_For_Symbol {
    public static void main(String[] args) {
        int x;
        int y;
        char Symbol;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of x =");
        x = scanner.nextInt();

        System.out.println("Please enter the value of y =");
        y = scanner.nextInt();

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any symbol from +, -, / ,*");
        Symbol = scanner.next().charAt(0);

        if (Symbol == '+') {
            System.out.println("Result of symbol = " + (x + y));
        } else if (Symbol == '-') {
            System.out.println("Result of symbol = " + (x - y));
        } else if (Symbol == '/') {
            System.out.println("Result of symbol = " + (x / y));
        } else if (Symbol == '*') {
            System.out.println("Result of symbol = " + (x * y));
        }
    }
}

