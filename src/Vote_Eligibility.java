
//Write Java program to allow the user to input his/her age. Then the program will show if the
//person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years
//old.


import java.util.Scanner;

public class Vote_Eligibility {
    public static void main(String[] args) {
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the age = ");
        age = scanner.nextInt();

        if (age >= 18)
        {System.out.println("Eligible to vote");
        } else
        {System.out.println("Not eligible to vote");
        }
    }
}
