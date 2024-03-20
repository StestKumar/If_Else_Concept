//WAP input sales id, seller's name, sales amount, salary basic and then find this sales
//commission
//sales amount >= 50,000 35%
//sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%

import java.util.Scanner;

public class Sales_Commission {
    public static void main(String[] args) {
        int Sales_id;
        String Name;
        float Sales_amount;
        float Basic_salary;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales ID");
        Sales_id = scanner.nextInt();

        System.out.println("Enter Name");
        Name = scanner.next();

        System.out.println("Enter Sales amount");
        Sales_amount = scanner.nextFloat();

        System.out.println("Enter Basic Salary"); //NO USE OF BASIC SALARY IN THIS PROGRAM
        Basic_salary = scanner.nextFloat();

        if (Sales_amount >= 50000) {
            System.out.println("Sales commission = " + Sales_amount * 0.35);

        } else if (Sales_amount >= 30000) {
            System.out.println("Sales commission = " + Sales_amount * 0.20);

        } else if (Sales_amount >= 20000) {
            System.out.println("Sales commission = " + Sales_amount * 0.10);
        } else if (Sales_amount >= 10000) {
            System.out.println("Sales commission = " + Sales_amount * 0.05);
        } else {
            System.out.println("Sales commission = " + Sales_amount * 0.02);

        }


    }
}
