import javax.swing.*;
class p55
{    
    public static void main(String args[])    
    {     
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        
        JFrame jframe = new JFrame();
        jframe.setTitle("Button Example");
        jframe.setLayout(null);
        jframe.setSize(700, 700);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

        JButton jbutton = new JButton();
        jbutton.setText("I am a button.");
        jbutton.setBounds(100, 100, 200, 50);

        jframe.add(jbutton);
        jframe.setVisible(true);


    }
}