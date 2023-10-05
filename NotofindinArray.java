public class NotofindinArray {
    
    public static void main(String[] args) {
        int [] arrayS = new int[] {1,2,3,4,7,9};
        int nofind = 7;
       
        int i;
        for(i=0; i<=arrayS.length; i++)
        {
          try{
            if(nofind == arrayS[i])
            System.out.println("number found at " +i);
          
          } catch(Exception e){
            System.out.println("number not found");
          }
        }
          
        
}
}