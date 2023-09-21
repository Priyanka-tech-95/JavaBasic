import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        int n;
        int ld ;
        int reno =0 ;

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a 5 digit number");
        n = Sc.nextInt();
        for(int i =1; i<=5;i++){
        ld = n%10;
        n = n /10;
        reno = reno * 10 + ld;
        }

        System.out.println(+reno);
    }
    
}
