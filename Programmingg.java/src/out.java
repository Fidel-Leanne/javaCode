package src;

import java.awt.*;

import javax.swing.*;


public class out extends JFrame{
    public out() {
    }

    public out(GraphicsConfiguration gc) {
        super(gc);
    }

    public out(String title) throws HeadlessException {
        super(title);
    }

    public out(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }

    private void initialise() {

        final Font mainfont= new Font ("Segoe Print ", Font.BOLD, 18);
        JTextField tfFirstName, tfLastName;
        /*form panel */
        JLabel IbFirstName = new JLabel("First Name");
         IbFirstName.setFont(mainfont);

         tfFirstName= new JTextField();
         tfFirstName.setFont(mainfont);

         JLabel IbLastName = new JLabel("last Name");
         IbLastName.setFont(mainfont);

         tfLastName= new JTextField();
         tfLastName.setFont(mainfont);

         JPanel formPanel = new JPanel();
         formPanel.setLayout(new GridLayout(4,1,5,5));
         formPanel.add(IbFirstName);
         formPanel.add(tfFirstName);
         formPanel.add(IbLastName);
         formPanel.add(tfLastName);



         
        JPanel mainPnel = new JPanel();
        mainPnel.setLayout(new BorderLayout());
        mainPnel.setBackground(new Color(128,128,255));
        mainPnel.add(formPanel, BorderLayout.NORTH);


        setTitle("Admin");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        
    }
     
}