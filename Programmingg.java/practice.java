
import java.util.Scanner;

public class practice{ 

   
    public static void main(String[] args) {
        
       Scanner random = new Scanner(System.in);

       int startNo = random.nextInt();
       int  endNo=random.nextInt();
      
       int sum =0;
while(true){
    if( startNo<0){
        System.out.println("startNo cannot be less than 0");
        {break;}
           
         }
         else if( endNo<0){
          System.out.println("endNo cannot be less than 0");
          {break;}
           
         } 
         else if( endNo>9) {
          System.out.println("endNo cannot be greater than 9");{break;}
           
         }
        else if( startNo> endNo){
            System.out.println("startNo must not be greater than endNo");{break;}
           
         }
  else{  do { // change to for loop this ome is whyling
   
      sum= sum + startNo ;
      startNo=startNo++;
      
   
    
    
  }  while(startNo<=endNo );{
    
  System.out.print("The Sum of Even Numbers upto  " +" = "+sum);{break;}
  }

     }
    
    }
   
  }
        
}
      

    
       
    

   

    

