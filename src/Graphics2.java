import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphics2 extends JFrame
	implements ActionListener {
		private JButton button;
		private JPanel panel;
		

	public static void main(String[] args) {
		Graphics2 frame = new Graphics2();
		frame.setSize(400, 300);
		frame.createGUI();
		frame.setVisible(true);
	}
		
	private void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 200));
		panel.setBackground(Color.white);
		window.add(panel);
		
		button = new JButton("Press Me");
		window.add(button);
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event) {
		Graphics paper = panel.getGraphics();
		//paper.drawLine(0, 0, 100, 100);
		drawshape();
	
	}
	public void drawshape(){
		Graphics paper = panel.getGraphics();
		paper.drawLine(10, 10, 100, 10);
		paper.drawLine(10, 10, 10, 100);
		paper.drawLine(10, 100, 100, 100);
		paper.drawLine(100, 10, 100, 100);
	}
}

