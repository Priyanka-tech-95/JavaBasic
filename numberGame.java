import java.util.*;
public class numberGame {
  public static int game(){
    return 0;
  }
  public static void main(String[] args) {
    System.out.println("Do you want to play a game, then enter number. if not then enter 0");
    Scanner Sc = new Scanner(System.in);
    int i = 0;
       int number [] = new int [i];   
    do{
      number[i] = Sc.nextInt();
   
      i++;
    }while(number[i]==0);

    game();


    
  }
  
}
