import javax.swing.*;
class p54    
{    
    public static void main(String args[])    
    {     
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        
        JFrame f= new JFrame("TextField Example");    
        JTextField t1;     
        t1 = new JTextField("Welcome to Raipur.");    
        t1.setBounds(50,100, 200,30);      
        f.add(t1);  
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
    }    
}    