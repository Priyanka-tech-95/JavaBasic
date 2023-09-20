import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age >= 18)
        {
            System.out.println("Is adult");
        }
        else
        {
            System.out.println("Not adult");
        }
    }
    
}
