import java.util.*;

public class Function3 {
    public static int greaterNo(int a, int b){
        if( a > b){
            System.out.println("Greater number is " + a);
        }else{
            System.out.println("Greater number is " + b);
        }
        return 0;
    }


public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    int a = Sc.nextInt();
    int b = Sc.nextInt();
    greaterNo(a, b);
}
}