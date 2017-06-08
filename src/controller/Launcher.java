package controller;

import model.Ball;
import view.Frame;
import view.Panel;

public class Launcher {

	public static void main(String[] args) {
		
		Ball ball = new Ball(100, 100);
		Panel panel = new Panel(ball);
		Frame PrincipalFrame = new Frame(panel);
		
	}

}
