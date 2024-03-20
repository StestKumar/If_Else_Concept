
//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA -PF

import java.util.Scanner;
import java.util.SortedMap;

public class Salary_of_Employee {
    public static void main(String[] args) {
        String Name;
        int Employee_ID;
        float Basic_Salary;
        float HRA, DA, TA, PF, Gross_Salary;

        Scanner Input = new Scanner(System.in);
        System.out.println("Please Enter Name = ");
        Name = Input.next();
        System.out.println("Please Enter Employee ID = ");
        Employee_ID = Input.nextInt();
        System.out.println("Please Enter Basic Salary = ");
        Basic_Salary = Input.nextFloat();
        HRA = (10 * Basic_Salary) / 100;
        System.out.println("HRA =" + HRA);
        DA = (8 * Basic_Salary) / 100;
        System.out.println("DA = " + DA);
        TA = (9 * Basic_Salary) / 100;
        System.out.println("TA = " + TA);
        PF = (20 * Basic_Salary) / 100;
        System.out.println("PF = " + PF);
        Gross_Salary = ((Basic_Salary + HRA + DA + TA) - PF);
        System.out.println("Gross Salary of Employee = " + Gross_Salary);

    }
}


