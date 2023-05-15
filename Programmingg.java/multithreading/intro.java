package multithreading;

public class intro {


    public static void main(String[] args) {
   
        for(int i = 0 ; i<5;i++) {

        intro2 myObj = new intro2(i);
        myObj.start();

    }


    }
    
}
