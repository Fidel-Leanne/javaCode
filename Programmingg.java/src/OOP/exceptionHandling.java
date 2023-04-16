package src.OOP;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exceptionHandling {
    
    public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);

         String word = scanner.nextLine();

    try {
        int myInt = Integer.parseInt(word);
        
    } catch (NumberFormatException  e) {
        // TODO: handle exception
        JOptionPane.showMessageDialog(null, e, null, 0);
    }

    finally {
        System.out.println(word);
    }
    }
}
