package com.cbullers.gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.cbullers.config.Config;
import com.cbullers.delegations.Delegator;

public class TicButton extends JButton {

	private static final long serialVersionUID = 1L;

	public char MOVE = 'c';
	
	public boolean isOccupied = false;
	
	private TicButton pThis = this;
	
	private int strPos; // where it is on the Config.currentBoard
	
	public TicButton(int x, int y, int w, int h, int pos) {
		this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.setBackground(new Color(0,0,0,0));
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);			// So it isn't drawn on the back
		this.setFocusPainted(false);
		this.setOpaque(false);
		this.strPos = pos;
		this.setBounds(x,y,w,h);
		
		
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(pThis.isOccupied || Config.winner != 'c') return;
				Config.currentPlayer = (Config.currentPlayer == 0) ? 1 : 0;
				pThis.MOVE = (Config.currentPlayer == 0) ? 'o' : 'x';
				if(pThis.MOVE == 'c') return;
				// okay to do stuff
				StringBuilder boardBuilder = new StringBuilder(Config.currentBoard);
				boardBuilder.setCharAt(pThis.strPos, pThis.MOVE);
				Config.currentBoard = boardBuilder.toString();
				
				pThis.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(pThis.MOVE+".png")));
				pThis.isOccupied = true;
				
				if(Delegator.checkWinner()) {
					// yay winner
					JOptionPane.showConfirmDialog(pThis, Config.winner+" wins!"); //temporary
				}
				
			}
			
		});
	}
	
	public void setMove(char move) { // Like, what it should do when they click
		this.MOVE = move; // Available options are x and o
	}
	
	// gives it the grid
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.black);
		g.drawRect(0, 0, this.getWidth(), this.getHeight());
	}
	
}
