package model;

public abstract class Form {
	
	protected int posX;
	protected int posY;
	protected int height;
	protected int width;
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
}