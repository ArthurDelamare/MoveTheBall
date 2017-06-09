package model;

public class Ball extends Form{

	public Ball(int w, int h){
		this.posX = 0;
		this.posY = 0;
		this.width = w;
		this.height = h;
	}
	
	public Ball(int x, int y, int w, int h){
		this.posX = x;
		this.posY = y;
		this.width = w;
		this.height = h;
	}
	
	public void move(int newPosX, int newPosY){
		this.setPosX(newPosX);
		this.setPosY(newPosY);
	}
	
	
	
}
