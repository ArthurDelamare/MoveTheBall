package controller;

import model.Ball;
import view.Frame;

public class Controller {
	
	private Frame frame;
	private Ball ball;
	
	public Controller(Frame view, Ball model){
		this.frame = view;
		this.ball = model;
		this.frame.getPanel().setBall(ball.getPosX(), ball.getPosY(), ball.getWidth(), ball.getHeight());;
	}
	
	
	
}
