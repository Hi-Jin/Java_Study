package gridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.Container;

public class MyFrame extends JFrame {
	
	JButton[] btn = new JButton[6];
	public void create_container() {
		Container container = this.getContentPane();
		
		for(int i = 0; i < 6; i++) {
			btn[i] = new JButton(i + "");
			container.add(btn[i]);
		}
	}
	
	public MyFrame() {
		super("This is GridLayout");
		this.setLayout(new GridLayout(3, 2));
		create_container();
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
