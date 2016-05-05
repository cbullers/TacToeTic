package com.cbullers.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class OnePlayer extends JFrame {

	private static final long serialVersionUID = 1L;

	// To move it places
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public static void open() {
		new OnePlayer();
	}
	
	public OnePlayer() {
		this.setBounds(screenSize.width/2-300,screenSize.height/2-300,603,603);
		this.setVisible(true);
	}

}
