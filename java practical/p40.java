import java.awt.event.*;
import javax.swing.*;

public class p40 extends JFrame implements KeyListener{
	JLabel jlabel;
	JTextArea jtextarea;

	public p40(){
		jlabel = new JLabel();
		jlabel.setText("Press a key......");
		jlabel.setBounds(20, 50, 300, 20);
		
		jtextarea = new JTextArea();
		jtextarea.setBounds(20, 80, 300, 300);
		jtextarea.addKeyListener(this);

		add(jlabel);
		add(jtextarea);

		setTitle("KeyListener Example ");
		setSize(400, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e){
		jlabel.setText("Key Pressed : " + e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e){
		jlabel.setText("Key Pressed : " + e.getKeyChar());
	}

	@Override
	public void keyTyped(KeyEvent e){
		jlabel.setText("Key Typed : " + e.getKeyChar());
	}

	public static void main(String[] args){
		System.out.println("Name : Sameer");
	        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
		
		p40 p = new p40();
	}
}	