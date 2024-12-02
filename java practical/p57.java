import java.awt.*;
import javax.swing.*;

public class p57 extends JFrame {

    public p57() {
        setTitle("JCheckBox Demo");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        JButton button = new JButton("Get Selection");

        button.addActionListener(e -> {
            String message = "Selected options: ";
            if (checkBox1.isSelected()) {
                message += "Option 1 ";
            }
            if (checkBox2.isSelected()) {
                message += "Option 2 ";
            }
            if (!checkBox1.isSelected() && !checkBox2.isSelected()) {
                message += "None";
            }
            JOptionPane.showMessageDialog(this, message);
        });

        add(checkBox1);
        add(checkBox2);
        add(button);
    }

    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        SwingUtilities.invokeLater(() -> {
            p57 demo = new p57();
            demo.setVisible(true);
        });
    }
}