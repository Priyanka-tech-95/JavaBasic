import java.util.Scanner;
import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        int x;
         Scanner Sc = new Scanner(System.in);
         x = Sc.nextInt();
         if((x%2) == 0){
            System.out.println("is even number");
         }else{
            System.out.println("is odd number");
         }
    }
}
