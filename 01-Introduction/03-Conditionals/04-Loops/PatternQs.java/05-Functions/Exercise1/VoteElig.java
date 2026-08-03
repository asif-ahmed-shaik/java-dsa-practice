package Exercise1;
import java.util.*;

public class VoteElig {

    public static void Eligibility(int age) {
        if(age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        Eligibility(age);
    }
}
    

