package src;

import java.util.Scanner;



public class fidel{

    public static void main(String [] args) { //main is the function name 
        
        Scanner random = new Scanner(System.in) ;
            int x =random.nextInt();
            int y = random.nextInt();
            int total ;
            System.out.println();
        
         
       
 /*  if (x<y){
            do{
            {
                total= total +x;
                x++;

            }
         
        }while(x<=y);

        }
        else{
            do{
                total=total+x;
                x--;

            }while(x>=y);

        }*/      

     

    
        
    }



 public static int total (int x, int y) {
     
    int total=0;

    for(int i=x; i<=y;i++){

        total= total+i;
    }
    return total;
    
   
    
}



 public static int product (int x, int y){
   
     
    int product = x*y;
    return product;
    
 }
}