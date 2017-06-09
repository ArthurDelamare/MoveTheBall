package view;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private int ballPosX, ballPosY, ballWidth, ballHeight;
	
	public void paintComponent(Graphics g){
		g.fillOval(this.ballPosX, this.ballPosY, this.ballWidth, this.ballHeight);
		g.fillOval(this.getWidth(), this.getHeight()/2, 50, 50);
	}
	
	public void setBall(int posX, int posY, int width, int height){
		this.ballPosX = posX;
		this.ballPosY = posY;
		this.ballWidth = width;
		this.ballHeight = height;
	}
	
}
