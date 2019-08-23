package flowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.FlowLayout;

// 굳이 상속받는 이유가 뭐지
public class MyFrame extends JFrame {
	
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	
	// Frame 생성자
	public MyFrame() {
		// _1에서의 JFrame frame = new JFrame("제목"); 과 똑같다. 상속을 받았으므로.
		super("This is myFrame");
		this.setLayout(new FlowLayout()); // 왼쪽부터 채워짐
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		
		this.setSize(300, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
