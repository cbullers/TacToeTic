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
	
	private int row, column; // where it is on the Config.currentBoard
	
	public TicButton(int x, int y, int w, int h, int row, int column) {
		this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.setBackground(new Color(0,0,0,0));
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);			// So it isn't drawn on the back
		this.setFocusPainted(false);
		this.setOpaque(false);
		this.row = row;
		this.column = column;
		this.setBounds(x,y,w,h);
		
		// Change if it is singleplayer or not
		if(!Config.singleplayer) {
			this.addActionListener(new ActionListener() {
	
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// Make sure that its ok to click
					if(pThis.isOccupied || Config.winner != 'c') return;
					
					// Switch turns on clicking the button
					Config.currentPlayer = (Config.currentPlayer == 0) ? 1 : 0;
					
					// The person, opposite of the current player
					pThis.MOVE = (Config.currentPlayer == 0) ? 'o' : 'x';
	
					// okay to do stuff
					
					// Set the character representation of the board
					Config.currentBoard[pThis.row][pThis.column] = pThis.MOVE;
					
					// Sets the button as X or an O
					pThis.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(pThis.MOVE+".png")));
					pThis.isOccupied = true;
					
					if(Delegator.checkWinner()) {
						JOptionPane.showConfirmDialog(null, Config.winner+" wins!"); //temporary
						// TODO show line of winning
					}
					
				}
				
			});
		}else{
			// add singleplayer listener
			this.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
				}
				
			});
		}
	}
	
	// gives it the grid
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.black);
		g.drawRect(0, 0, this.getWidth(), this.getHeight());
	}
	
}
