package multithreading;

public class intro2  extends Thread{


    private int threadNumber;

    public intro2(int threadNumber){

        this.threadNumber= threadNumber;
    }

    @Override
    public void run (){
    
        for (int i =1 ; i<= 5; i++){
            System.out.println(i);

            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }

    }
    
}
