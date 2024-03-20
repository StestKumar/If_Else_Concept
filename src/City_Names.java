//Input any alphabet from a to f and print their city name accordingly (use if else) any other
//alphabet should be invalid entry


import java.util.Scanner;

public class City_Names {
    public static void main(String[] args) {
        char Alphabet;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any single alphabet from a to f or A to F");
        Alphabet = scanner.next().charAt(0);

        if (Alphabet == 'A' || Alphabet == 'a') {
            System.out.println("AGRA");
        } else if (Alphabet == 'B' || Alphabet == 'b') {
            System.out.println("BIHAR");
        } else if (Alphabet == 'C' || Alphabet == 'c') {
            System.out.println("CHENNAI");
        } else if (Alphabet == 'D' || Alphabet == 'd') {
            System.out.println("DELHI");
        } else if (Alphabet == 'E' || Alphabet == 'e') {
            System.out.println("EAST SIKKIM");
        } else if (Alphabet == 'F' || Alphabet == 'f') {
            System.out.println("FARIDABAD");
        } else {
            System.out.println("INVALID ENTRY");
        }
    }
}




