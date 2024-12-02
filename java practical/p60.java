import javax.swing.*;
import java.awt.*;

public class p60 extends JFrame {

    public p60() {
        setTitle("JList Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Sample data for the list
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        JList<String> list = new JList<>(items);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setPreferredSize(new Dimension(150, 100));

        JButton button = new JButton("Get Selection");
        button.addActionListener(e -> {
            String selectedItem = list.getSelectedValue();
            JOptionPane.showMessageDialog(this, "Selected item: " + (selectedItem != null ? selectedItem : "None"));
        });

        add(scrollPane);
        add(button);
    }

    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        SwingUtilities.invokeLater(() -> {
            p60 demo = new p60();
            demo.setVisible(true);
        });
    }
}