package src.OOP;

public class polymorphism{
  public String color;
public void myFavoriteColor(){

System.out.println("My Favourite color is"+ color);
 }
    
}

class Jane extends polymorphism{
 String  color ="red";
    public void myFavoriteColor(){
        System.out.println("My Favourite color is "+ color);

    }
}



