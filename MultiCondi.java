import java.util.Scanner;

public class MultiCondi {
    public static void main(String[] args) {
      Scanner Sc = new Scanner(System.in);
      int x = Sc.nextInt();
      int y =Sc.nextInt();
      if(x==y){
        System.out.println("equal");
      }else if(x>y)  {
        System.out.println("greater");
      } else{
        System.out.println("Lesser");
      }
    }
    
}
