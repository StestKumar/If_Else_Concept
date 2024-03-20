//WAP to input student name, roll no, 3 subjects marks and find out total, percentage and result if
//he is pass or fail on basis of percentage (pass>=35) and also give them grade
//>= 80 A+
//>= 60 A
//>= 50 B
//>= 35 C


import java.util.Scanner;

public class Student_Result {
    public static void main(String[] args) {

        String Name;
        int Roll_no;
        float English_marks;
        float Maths_marks;
        float Science_marks;
        float Percentage;

        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the name of the student");
            Name = scanner.next();

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter the Roll no. of the student");
            Roll_no = scanner.nextInt();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please enter the Marks in English");
            English_marks = scanner.nextFloat();

            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Please enter the Marks in Maths");
            Maths_marks = scanner.nextFloat();

            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Please enter the Marks in Science");
            Science_marks = scanner.nextFloat();


            Percentage = (float) ((English_marks + Maths_marks + Science_marks) / 300 * 100);

            {
                System.out.println(("Addition of three subjects") + "=" + (English_marks + Maths_marks + Science_marks));
            }

            {
                System.out.println(("Percentage of Student") + "=" + (Percentage));

            }
            if (Percentage >= 80) {
                System.out.println("Grade of student = A+");
            } else if (Percentage >= 60) {
                System.out.println("Grade of student = A");
            } else if (Percentage >= 50) {
                System.out.println("Grade of student = B");
            } else if (Percentage >= 35) {
                System.out.println("Grade of student = C");
            } else {
                System.out.println("Student Failed");
            }
        }
    }
}