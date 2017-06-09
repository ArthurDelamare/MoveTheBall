package main;

import controller.Controller;
import model.Ball;
import view.Frame;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Ball ball = new Ball(100,100);
		Frame principalFrame = new Frame();
		Controller controller = new Controller(principalFrame, ball);
		
	}

}
