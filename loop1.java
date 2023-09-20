import java.util.*;

public class loop1 {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        
       int input;
        
       
        
        do{
            

            System.out.println("Enter the Marks of student");

            int marks = Sc.nextInt();

            if(marks >= 90){
             System.out.println("This is good");
            } else if (marks <=89 && marks >= 60){
             System.out.println("This is also good");
            } else if (marks <= 59 && marks > 0 ){
             System.out.println("This is good as well");
            } else{System.out.println("Not valid");
            }
             System.out.println("Do you want to continue (yes= 1 no =0)");
             input =Sc.nextInt();

        }while(input == 1);
    }
    
}
