package view;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	
	public Frame(Panel panel){
		
		this.setTitle("Move The Ball");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		this.setContentPane(panel);
		this.setVisible(true);
		
	}
	
}
