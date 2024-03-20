
//WAP input any number, the print Day name of the week accordingly by using if else

import java.util.Scanner;

public class Day_of_Week {
    public static void main(String[] args) {
        int Number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number between 1 - 7");
        Number = scanner.nextInt();

        if (Number == 1) {
            System.out.println("Today is Sunday");
        } else if (Number == 2) {
            System.out.println("Today is Monday");
        } else if (Number == 3) {
            System.out.println("Today is Tuesday");
        } else if (Number == 4) {
            System.out.println("Today is Wednesday");
        } else if (Number == 5) {
            System.out.println("Today is Thursday");
        } else if (Number == 6) {
            System.out.println("Today is Friday");
        } else if (Number == 7) {
            System.out.println("Today is Saturday");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
