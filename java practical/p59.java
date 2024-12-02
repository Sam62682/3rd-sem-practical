import java.awt.*;
import javax.swing.*;

public class p59 extends JFrame {

    public p59() {
        setTitle("JComboBox Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] items = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        
        JButton button = new JButton("Get Selection");
        button.addActionListener(e -> {
            String selectedItem = (String) comboBox.getSelectedItem();
            JOptionPane.showMessageDialog(this, "Selected option: " + selectedItem);
        });

        add(comboBox);
        add(button);
    }

    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        SwingUtilities.invokeLater(() -> {
            p59 demo = new p59();
            demo.setVisible(true);
        });
    }
}