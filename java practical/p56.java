import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p56 extends JFrame {

    private JToggleButton toggleButton;
    private JLabel label;

    public p56() {
        setTitle("JToggleButton Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        toggleButton = new JToggleButton("Off");
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toggleButton.isSelected()) {
                    toggleButton.setText("On");
                    label.setText("Button is ON");
                } else {
                    toggleButton.setText("Off");
                    label.setText("Button is OFF");
                }
            }
        });

        label = new JLabel("Button is OFF");

        add(toggleButton);
        add(label);
    }

    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                p56 demo = new p56();
                demo.setVisible(true);
            }
        });
    }
}