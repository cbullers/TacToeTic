package com.cbullers.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;


public class TwoPlayer extends JFrame {

	private static final long serialVersionUID = 1L;

	// To move it places
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	// List of buttons
	List<TicButton> buttons = new ArrayList<TicButton>();
	
	public static void open() {
		new TwoPlayer();
	}
	
	public TwoPlayer() {
		this.setLayout(null);
		
		
		this.setBounds(screenSize.width/2-300,screenSize.height/2-300,620,643);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TicButton spot1 = new TicButton(0,0,200,200, 0, 0);
		TicButton spot2 = new TicButton(202,0,200,200, 0, 1);
		TicButton spot3 = new TicButton(402,0,200,200, 0, 2);
		TicButton spot4 = new TicButton(0,202,200,200, 1, 0);
		TicButton spot5 = new TicButton(202,202,200,200, 1, 1);
		TicButton spot6 = new TicButton(402,202,200,200, 1, 2);
		TicButton spot7 = new TicButton(0,402,200,200, 2, 0);
		TicButton spot8 = new TicButton(202,402,200,200, 2, 1);
		TicButton spot9 = new TicButton(402,402,200,200, 2, 2);
		
		buttons.add(spot1);
		buttons.add(spot2);
		buttons.add(spot3);
		buttons.add(spot4);
		buttons.add(spot5);
		buttons.add(spot6);
		buttons.add(spot7);
		buttons.add(spot8);
		buttons.add(spot9);
		
		for(TicButton b : buttons) {
			add(b);
		}
		
	}
	
}
