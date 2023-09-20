
import java.util.*;

public class Function1 {

    public static float average(int a, int b, int c){
        float av = (a+b+c)/3;
        System.out.println(av);
       
        return av;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();
        average(a,b,c);
    }
}
