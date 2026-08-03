/*package Exercise1;
import java.util.*;

public class StudentDetails {
    public static void studentDetails(String name, int age, double cgpa) {
        System.out.println("====================");
        System.out.println("Student Details");
        System.out.println("====================");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("CGPA : " + cgpa);

        if (cgpa >= 5.0) {
            System.out.println("Status : Pass");
        } else {
            System.out.println("Status : Fail");
        }
        System.out.println("====================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        studentDetails(name, age, cgpa);

        sc.close();
    }
    
}*/

package Exercise1;
import java.util.*;

public class StudentDetails {
    public static void getStudentDetails(String name, int age, double cgpa) {
        
        Scanner sc = new Scanner(System.in);

        name = sc.nextLine();
        age = sc.nextInt();
        cgpa = sc.nextDouble();

    }

    public static boolean checkEligibility(double cgpa) {
        if (cgpa >= 5.0) {
            return true;
        } else {
            return false;
        }
    }


    public static void displayStudent(String name, int age, double cgpa) {
        System.out.println("====================");
        System.out.println("Student Details");
        System.out.println("====================");

        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("CGPA : " + cgpa);

        System.out.println(checkEligibility(cgpa));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        displayStudent(name, age, cgpa);

        sc.close();
    }
}
