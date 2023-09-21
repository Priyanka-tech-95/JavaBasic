import java.util.Scanner;

public class nRaiseToX {
  

    public static int power( int x , int n){
        int po = 1;
        for( int i =1; i<=n; i++){
           
            po = po * x ;
        }
        System.out.println(+x +" to the power " +n +" is " +po);
        return 0;
    }

    public static void main(String[] args) {
        int n;
        int x;
      
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the value of x ");
        x = Sc.nextInt();
        System.out.println("Enter the value of n");
        n = Sc.nextInt();
        power(x,n);

    }
    
}
