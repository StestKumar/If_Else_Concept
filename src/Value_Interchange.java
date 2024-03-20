//WAP to input student name, roll no, 3 subjects marks and find out result if
//student is pass or fail on basis of student needs to pass a

//WAP to input any two numbers and then print their interchanged value


import java.util.Scanner;

public class Value_Interchange {
    public static void main(String[] args) {
        int x = 20;
        int y = 40;

        System.out.println("Before swapping x = " + x + " y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After swapping x = " + x + " y = " + y);

    }
}
