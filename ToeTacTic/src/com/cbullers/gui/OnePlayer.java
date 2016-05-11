package com.cbullers.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class OnePlayer extends JFrame {

	private static final long serialVersionUID = 1L;

	// To move it places
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	// List of buttons
	List<TicButton> buttons = new ArrayList<TicButton>();
	
	// Buttons
	static TicButton spot1, spot2, spot3, spot4, spot5, spot6, spot7, spot8, spot9;
	
	public static void open() {
		new OnePlayer();
	}
	
	public OnePlayer() {
		this.setLayout(null);
		
		this.setBounds(screenSize.width/2-300,screenSize.height/2-300,620,643);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		spot1 = new TicButton(0,0,200,200, 0, 0);
		spot2 = new TicButton(202,0,200,200, 0, 1);
		spot3 = new TicButton(402,0,200,200, 0, 2);
		spot4 = new TicButton(0,202,200,200, 1, 0);
		spot5 = new TicButton(202,202,200,200, 1, 1);
		spot6 = new TicButton(402,202,200,200, 1, 2);
		spot7 = new TicButton(0,402,200,200, 2, 0);
		spot8 = new TicButton(202,402,200,200, 2, 1);
		spot9 = new TicButton(402,402,200,200, 2, 2);
		
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
	
	public static void clickLocation(String loc) { // passed as "x,y" ie "1,1" is center
		int row = Integer.parseInt(String.valueOf(loc.charAt(0)));
		int column = Integer.parseInt(String.valueOf(loc.charAt(2)));
		
		if(row == 0) {
			if(column == 0) spot1.doClick();
			if(column == 1) spot2.doClick();
			if(column == 2) spot3.doClick();
		}else if(row == 1) {
			if(column == 0) spot4.doClick();
			if(column == 1) spot5.doClick();
			if(column == 2) spot6.doClick();
		}else if(row == 2) {
			if(column == 0) spot7.doClick();
			if(column == 1) spot8.doClick();
			if(column == 2) spot9.doClick();
		}
	}

}
