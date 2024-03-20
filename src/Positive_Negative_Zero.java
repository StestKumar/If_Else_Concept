
//WAP to input any number and find out if it is positive , negative or zero


import java.util.Scanner;

public class Positive_Negative_Zero {
    public static void main(String[] args) {
        float number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        number = scanner.nextFloat();

        if (number >= 1) {
            System.out.println("It is a Positive number");

        } else if (number < 0) {
            System.out.println("It is a Negative number");

        } else {
            System.out.println("Zero");
        }
    }
}
