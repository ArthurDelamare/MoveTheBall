package view;

import java.awt.Graphics;
import javax.swing.JPanel;
import model.Ball;

public class Panel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private Ball ball;
	
	public Panel(Ball b){
		this.ball = b;
	}
	
	public void paintComponent(Graphics g){
		g.fillOval(this.ball.getPosX(), this.ball.getPosY(), this.ball.getWidth(), this.ball.getHeight());
	}
}
