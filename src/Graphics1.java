import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Graphics1 extends JFrame {
	private JTextField gradText;
	
	public static void main(String[] args) {
		Graphics1 frame = new Graphics1();
		frame.setSize(300, 200);
		frame.createGUI();
		frame.setVisible(true);
	}
	
	private void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		gradText = new JTextField("Cameron McCoy, 11th Grade, June 2020");
		gradText.setEditable(false);
		window.add(gradText);
	}
}
