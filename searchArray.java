import java.util.*;

public class searchArray {

    public static void main(String[] args) {
        int [] arrayS = new int[] {1,2,3,4,7,9};
        int nofind = 7;

        for (int i=0; 1<arrayS.length; i++)
            if(nofind==arrayS[i]){
                System.out.println("number forund at " +i );
            }else{
                System.out.println("number not found");
            }
        
    }
    
}
