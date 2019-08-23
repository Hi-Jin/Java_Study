package helloSwing_1;

import javax.swing.JFrame;
import javax.swing.JButton;

public class HelloSwing{

	JFrame frame = new JFrame("Hello frame!");
	JButton button = new JButton("Button");
	
	public void createFrame() {
		frame.add(button);
		frame.setSize(300, 600);
		frame.setVisible(true);
		
		// swing의 x버튼 눌러서 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		HelloSwing myFrame = new HelloSwing();
		myFrame.createFrame();
	}
}
