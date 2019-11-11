import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphics4 extends JFrame
	implements ActionListener {
		private JButton button;
		private JPanel panel;
		

	public static void main(String[] args) {
		Graphics4 frame = new Graphics4();
		frame.setSize(400, 400);
		frame.createGUI();
		frame.setVisible(true);
	}
		
	private void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 300));
		panel.setBackground(Color.white);
		window.add(panel);
		
		button = new JButton("Press Me");
		window.add(button);
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event) {
		drawshape();
	
	}
	public void drawshape(){
		Graphics paper = panel.getGraphics();
		paper.setColor(Color.RED);
		drawCenteredCircle(paper, 150, 150, 160);
		paper.setColor(Color.WHITE);
		drawCenteredCircle(paper, 150, 150, 120);
		paper.setColor(Color.RED);
		drawCenteredCircle(paper, 150, 150, 80);
		paper.setColor(Color.WHITE);
		drawCenteredCircle(paper, 150, 150, 40);

		

	}
	
	public void drawCenteredCircle(Graphics g, int x, int y, int r) {
		  x = x-(r/2);
		  y = y-(r/2);
		  g.fillOval(x,y,r,r);
		}
}

