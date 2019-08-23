package borderLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Container;

public class MyFrame extends JFrame {
	
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	
	public void create_container() {
		// 컴포넌트를 넣을 컨테이너 구하기 
		Container myContainer = this.getContentPane();
		
		myContainer.add(btn1, BorderLayout.NORTH);
		// myContainer.add(btn2, BorderLayout.EAST);
		// myContainer.add(btn3, BorderLayout.WEST);
		myContainer.add(btn4, BorderLayout.SOUTH);
		// myContainer.add(btn5, BorderLayout.CENTER);
		
	}
	
	public MyFrame() {
		super("This is BorderLayout");
		this.create_container();
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
