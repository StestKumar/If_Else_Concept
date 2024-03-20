//Input any two number and find out its odd or even use ternary operator


import java.util.Scanner;

public class Ternary_operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
         int number = scanner.nextInt();

        if (number%2 == 0) {
            System.out.println("Even number");


        } else {
            System.out.println("Odd number");
        }

    }

}