public class TypeCasting {

    public static void main(String[] args) {

        // Implicit type casting
        int age = 19;
        double newAge = age;

        System.out.println("Implicit Type Casting");
        System.out.println("int value: " + age);
        System.out.println("double value: " + newAge);

        System.out.println();

        // Explicit type casting
        double cgpa = 7.95;
        int roundedCgpa = (int) cgpa;

        System.out.println("Explicit Type Casting");
        System.out.println("double value: " + cgpa);
        System.out.println("int value: " + roundedCgpa);

    }

}