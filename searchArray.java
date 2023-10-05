import java.util.*;

public class searchArray {

    public static void main(String[] args) {
        int [] arrayS = new int[] {1,2,3,4,7,9};
        int nofind = 4;

        //int count =0;
        int i ;

        for (i=0; 1<arrayS.length; i++) 
            if(nofind==arrayS[i]){
             //count = count + 1;
             //break;
             System.out.println("number found at place " +i);
             break;
      }

        
      /*if (count == 1){
        
        System.out.println("number not found");
      }*/

    }
} 

