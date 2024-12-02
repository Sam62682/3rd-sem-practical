import java.awt.*;
import javax.swing.*;

public class p58 extends JFrame {

    public p58() {
        setTitle("JRadioButton Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JRadioButton option1 = new JRadioButton("Option 1");
        JRadioButton option2 = new JRadioButton("Option 2");
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);

        JButton button = new JButton("Get Selection");
        button.addActionListener(e -> {
            String message = "Selected option: ";
            if (option1.isSelected()) {
                message += "Option 1";
            } else if (option2.isSelected()) {
                message += "Option 2";
            } else {
                message += "None";
            }
            JOptionPane.showMessageDialog(this, message);
        });

        add(option1);
        add(option2);
        add(button);
    }

    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        SwingUtilities.invokeLater(() -> {
            p58 demo = new p58();
            demo.setVisible(true);
        });
    }
}