import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = scanner.nextInt();

        if (year % 400 == 0)
            System.out.println("Its a leap year");
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Its a leap year");

        } else {
            System.out.println("Its not a leap year");

        }


    }

}
