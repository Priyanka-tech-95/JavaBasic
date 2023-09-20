import java.util.*;
public class Function2 {

    public static int oddSum(int n){
         int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                 sum = sum + i;
                
               
            }
           
        }
        System.out.println(sum); 
        return 0;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        oddSum(n);
       
       
        
    }
    
}
