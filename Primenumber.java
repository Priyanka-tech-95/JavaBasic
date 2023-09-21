import java.util.*;

public class Primenumber 
{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n;
        int count =0 ;
        System.out.println("Enter a number");
        n = Sc.nextInt();

        for(int i=1; i<=n; i++){
            
            if(n%i == 0){
                          count++;
            }
        }
        if (count == 2){
            System.out.println("The given number is prime number");
        }else{
            System.out.println("The given number is not prime number");
        }
    }
    
}
