//WAP input any five number and then find average of five numbers

import java.util.Scanner;
public class Average_of_5 {
    public static void main(String[] args) {
        int Num01;
        int Num02;
        int Num03;
        int Num04;
        int Num05;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        Num01 = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter 2nd number");
        Num02 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter 3rd number");
        Num03 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter 4th number");
        Num04 = scanner3.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter 5th number");
        Num05 = scanner4.nextInt();

        float total = Num01 + Num02 + Num03 + Num04 + Num05;
        System.out.println("Average of Numbers = " + total / 5);

    }
}
