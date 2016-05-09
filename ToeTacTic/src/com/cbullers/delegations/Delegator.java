package com.cbullers.delegations;

import com.cbullers.config.Config;
import com.cbullers.gui.OnePlayer;
import com.cbullers.gui.TwoPlayer;

public class Delegator {

	public static void openOnePlayer() {
		OnePlayer.open();
	}
	
	public static void openTwoPlayer() {
		TwoPlayer.open();
	}
	
	public static boolean checkWinner() {
		
		// Check x first
		String checkBoard = Config.currentBoard.replace('o', 'c');
		for(String check : Config.WIN_COMBOS) {
			if(check.equals(checkBoard)) {
				// x is winner
				Config.winner = 'x';
				return true;
			}
		}
		
		// Check o
		String checkBoard1 = Config.currentBoard.replace('x', 'c').replace('o', 'x'); // so we can compare to the board
		for(String check : Config.WIN_COMBOS) {
			if(check.equals(checkBoard1)) {
				// o is winner
				Config.winner = 'o';
				return true;
			}
		}
		
		return false;
	}
	
}
