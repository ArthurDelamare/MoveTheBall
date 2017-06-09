package view;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private Panel panel;
	
	public Frame(){
		
		//Instanciation du panel
		this.panel = new Panel();
		
		//Initialisation de la fenêtre
		this.setTitle("Move The Ball");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		this.setContentPane(panel);
		this.setVisible(true);
		
	}
	
	public Panel getPanel(){
		return panel;
	}
	
}
