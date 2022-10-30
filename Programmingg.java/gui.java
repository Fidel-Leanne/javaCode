
import java.awt.*;

import javax.swing.*;
class gui{


    public static void main(String args[]){

        
       
        
       JFrame frame = new JFrame("Welcome Admin");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       

       final Font mainfont= new Font ("Segoe Print ", Font.BOLD, 18);
       JTextField tfFirstName, tfLastName;
       /*form panel */
       JLabel IbFirstName = new JLabel("Student Details");
        IbFirstName.setFont(mainfont);

        tfFirstName= new JTextField();
        tfFirstName.setFont(mainfont);

        JLabel IbLastName = new JLabel("Lecturer Details");
        IbLastName.setFont(mainfont);
        

        tfLastName = new JTextField();
        tfLastName.setFont(mainfont);

         JLabel InsertResults= new JLabel("insert results");
         InsertResults.setFont(mainfont);

         JTextField tfInsertResults = new JTextField();
         tfInsertResults.setFont(mainfont);
       
         JPanel  newPanel=new JPanel();
         newPanel.setLayout(new GridLayout(4,1,5,5));
         newPanel.add(InsertResults);
        newPanel.add(tfInsertResults);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5));
        formPanel.add(IbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(IbLastName);
        formPanel.add(tfLastName);
        formPanel.add(newPanel);
        
       

        
        

       JPanel mainPnel = new JPanel();
       mainPnel.setLayout(new BorderLayout());
     
       mainPnel.add(formPanel, BorderLayout.NORTH);

       
       
       JButton button = new JButton("EXIT");
       frame.getContentPane().add(button); 
       frame.getContentPane().add(mainPnel);
      // Adds Button to content pane of frame
       frame.setVisible(true);


    }

    
}

