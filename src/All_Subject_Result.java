//WAP to input student name, roll no, 3 subjects marks and find out result if
//he is pass or fail on the basis of student needs to pass all the subjects


import java.util.Scanner;

public class All_Subject_Result {
    public static void main(String[] args) {

        String Name;
        int Roll_no;
        float Biology_marks;
        float Hindi_marks;
        float Accounts_marks;

        {  Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Name = ");
            Name = scanner.next();

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter Roll No. = ");
            Roll_no = scanner.nextInt();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter English Marks = ");
            Biology_marks = scanner.nextFloat();

            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter Maths Marks = ");
            Hindi_marks = scanner.nextFloat();

            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Enter Science Marks = ");
            Accounts_marks = scanner.nextFloat();


            if (Biology_marks >= 35) {
                System.out.println("Student Passed");
            } else if (Hindi_marks >= 35) {
                System.out.println("Student Passed");
            } else if (Accounts_marks >= 35) {
                System.out.println("Student Passed");
            } else {
                System.out.println("Student Failed");
            }

        }
    }
}