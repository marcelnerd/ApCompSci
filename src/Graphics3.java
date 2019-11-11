import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphics3 extends JFrame
	implements ActionListener {
		private JButton button;
		private JPanel panel;
		

	public static void main(String[] args) {
		Graphics3 frame = new Graphics3();
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
		paper.drawLine(10, 80, 100, 80);
		paper.drawLine(10, 80, 10, 170);
		paper.drawLine(10, 170, 100, 170);
		paper.drawLine(100, 80, 100, 170);
		paper.drawLine(10, 80, 55, 40);
		paper.drawLine(55, 40, 100, 80);
		paper.drawLine(45, 170, 45, 130);
		paper.drawLine(45, 130, 70, 130);
		paper.drawLine(70, 130, 70, 170);
		paper.drawLine(20, 100, 20, 120);
		paper.drawLine(20, 120, 40, 120);
		paper.drawLine(40, 120, 40, 100);
		paper.drawLine(40, 100, 20, 100);
		paper.drawLine(100, 80, 100, 30);
		paper.drawLine(100, 30, 80, 30);
		paper.drawLine(80, 30, 80, 62);
		paper.drawLine(70, 100, 70, 120);
		paper.drawLine(70, 120, 90, 120);
		paper.drawLine(90, 120, 90, 100);
		paper.drawLine(90, 100, 70, 100);
	}
}

