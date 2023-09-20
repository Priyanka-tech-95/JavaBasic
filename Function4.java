import java.util.*;
public class Function4 {
    public static double circle(double r){
      
        return 2 * 3.14 * r;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        double r = Sc.nextDouble();
       System.out.println("The Circumference of Circle is " +circle(r));
    }
    
}
