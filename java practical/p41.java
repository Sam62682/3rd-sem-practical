import java.awt.event.*;
import javax.swing.*;

public class p41 extends JFrame implements MouseListener {
    JLabel label;

    p41() {
        // Set up the JFrame
        setTitle("Mouse Event Example");
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and set up the JLabel
        label = new JLabel();
        label.setBounds(20, 50, 200, 20);
        add(label);

        // Add mouse listener
        addMouseListener(this);

        // Make the frame visible
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public static void main(String[] args) {
	System.out.println("Name : Sameer");
    System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        p41 p = new p41();
    }
}