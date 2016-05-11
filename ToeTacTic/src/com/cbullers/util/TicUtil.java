package com.cbullers.util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.cbullers.config.Config;


public class TicUtil {

	// Meant to soley be used for tic tac toe
	public static char[][] replaceAll(char[][] board, char what, char with) {
		
		char[][] ret = board;
		
		for(int i = 0; i < board[0].length; i++) {
			if(board[0][i] == what) { ret[0][i] = with; continue; }
			ret[0][i] = board[0][i];
		}
		for(int i = 0; i < board[1].length; i++) {
			if(board[1][i] == what) { ret[1][i] = with; continue; }
			ret[1][i] = board[1][i];
		}
		for(int i = 0; i < board[2].length; i++) {
			if(board[2][i] == what) { ret[2][i] = with; continue; }
			ret[2][i] = board[2][i];
		}
		
		return ret;
		
	}
	
	// Ask for piece
	public static void askForPlayerPiece() {
		JFrame f = new JFrame("Player Piece?");
		f.setBounds(500,500,400,200);
		f.setLayout(null);
		
		JButton x = new JButton("X");
		JButton o = new JButton("O");
		
		x.setBounds(20,20,50,50);
		o.setBounds(80,20,50,50);
		
		x.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Config.aiChar = 'o';
			}
			
		});
		
		o.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Config.aiChar = 'x';
			}
			
		});
		
		f.add(x);
		f.add(o);
		
		f.setVisible(true);
		
	}
	
	// Debug purposes
	public static void printBoard(char[][] board) {
		for(char c : board[0]) {
			System.out.print(c+",");
		}
		System.out.println();
		for(char c : board[1]) {
			System.out.print(c+",");
		}
		System.out.println();
		for(char c : board[2]) {
			System.out.print(c+",");
		}
		System.out.println();
		System.out.println();
	}
	
	public static char[][] copy(char[][] wat) {
		char[][] ret = {{'c','c','c'},{'c','c','c'},{'c','c','c'}};
		
		for(int i = 0; i < wat[0].length; i++) {
			ret[0][i] = wat[0][i];
		}
		for(int i = 0; i < wat[1].length; i++) {
			ret[1][i] = wat[1][i];
		}
		for(int i = 0; i < wat[2].length; i++) {
			ret[2][i] = wat[2][i];
		}
		
		return ret;
	}
	
	public static boolean isOccupied(int row, int column) {
		if(Config.currentBoard[row][column] == 'c') {
			return false;
		}else{
			return true;
		}
	}
	
}
