package com.cbullers.gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.cbullers.config.Config;

public class TicButton extends JButton {

	private static final long serialVersionUID = 1L;

	public String MOVE = "CLEAR";
	
	public boolean isOccupied = false;
	
	private TicButton pThis = this;
	
	public TicButton(int x, int y, int w, int h) {
		this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.setBackground(new Color(0,0,0,0));
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);			// So it isnt drawn on the back
		this.setFocusPainted(false);
		this.setOpaque(false);
		
		this.setBounds(x,y,w,h);
		
		
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(pThis.isOccupied) return;
				Config.currentPlayer = (Config.currentPlayer == 0) ? 1 : 0;
				pThis.MOVE = (Config.currentPlayer == 0) ? "o" : "x";
				if(pThis.MOVE.equals("CLEAR")) return; 
				pThis.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(pThis.MOVE+".png")));
				pThis.isOccupied = true;
			}
			
		});
	}
	
	public void setMove(String move) { // Like, what it should do when they click
		this.MOVE = move; // Availible options are x and o
	}
	
}
