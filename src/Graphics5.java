import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphics5 extends JFrame
	implements ActionListener {
		private JButton button;
		private JPanel panel;
		

	public static void main(String[] args) {
		Graphics5 frame = new Graphics5();
		frame.setSize(400, 400);
		frame.createGUI();
		frame.setVisible(true);
	}
		
	private void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(360, 30));
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
		paper.fillRect(0, 0, 30, 30);
		paper.setColor(Color.BLUE);
		paper.fillRect(30, 0, 30, 30);
		paper.setColor(Color.YELLOW);
		paper.fillRect(60, 0, 30, 30);
		paper.setColor(Color.ORANGE);
		paper.fillRect(90, 0, 30, 30);
		paper.setColor(Color.BLACK);
		paper.fillRect(120, 0, 30, 30);
		paper.setColor(Color.CYAN);
		paper.fillRect(150, 0, 30, 30);
		paper.setColor(Color.GREEN);
		paper.fillRect(180, 0, 30, 30);
		paper.setColor(Color.MAGENTA);
		paper.fillRect(210, 0, 30, 30);
		paper.setColor(Color.GRAY);
		paper.fillRect(240, 0, 30, 30);
		paper.setColor(Color.DARK_GRAY);
		paper.fillRect(270, 0, 30, 30);
		paper.setColor(Color.LIGHT_GRAY);
		paper.fillRect(300, 0, 30, 30);
		paper.setColor(Color.PINK);
		paper.fillRect(330, 0, 30, 30);
	}
	
	public void drawCenteredCircle(Graphics g, int x, int y, int r) {
		  x = x-(r/2);
		  y = y-(r/2);
		  g.fillOval(x,y,r,r);
		}
}

