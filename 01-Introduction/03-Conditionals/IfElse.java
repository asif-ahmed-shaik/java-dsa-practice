import java.util.Scanner;

public class IfElse {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");

        }

        sc.close();
    }
}

//ElseIf

/* import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
*/

//Switchcase

/*
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Addition selected.");
                break;

            case 2:
                System.out.println("Subtraction selected.");
                break;

            case 3:
                System.out.println("Multiplication selected.");
                break;

            case 4:
                System.out.println("Division selected.");
                break;

            default:
                System.out.println("Invalid Choice");

        }

        sc.close();
    }
} */
