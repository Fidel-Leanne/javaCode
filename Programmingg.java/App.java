import java.util.Scanner;

public class App{

    private static long[] fibonacciCache;
    public static void main(String[] args) {
        
     
        Scanner random= new Scanner(System.in);

        int n=random.nextInt();

        fibonacci(n);
        fibonacciCache= new long[n+1];
        for(int i=0;i<=n;i++){
            System.out.println(fibonacci(n));
        }
      

}

    private static long fibonacci(int n) {
        if (n<=1) {
        return n;
    }
    if (fibonacciCache[n] != 0){
      return fibonacciCache[n];
    }
        long nthFibonacciNumber= (fibonacci(n-2)+ fibonacci(n-1));
        fibonacciCache[n]=nthFibonacciNumber;
        
        return nthFibonacciNumber;
       
    }
}