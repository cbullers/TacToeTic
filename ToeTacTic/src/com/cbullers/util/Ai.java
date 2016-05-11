package com.cbullers.util;

import com.cbullers.config.Config;
import com.cbullers.gui.OnePlayer;

public class Ai {
	
	// Define all variables private, the player is def a hacker
	private static String findBestMove() {
		String pos = "2,1";
		
		char[][] playerBoard = TicUtil.copy(Config.currentBoard); // Where the players pieces are
		playerBoard = TicUtil.replaceAll(playerBoard, Config.aiChar, 'z');
		playerBoard = TicUtil.replaceAll(playerBoard, ((Config.aiChar == 'x') ? 'o' : 'x'), 'x');
		playerBoard = TicUtil.replaceAll(playerBoard, 'z', 'o'); // Player is always X, AI is always O
		
		TicUtil.printBoard(playerBoard);
		
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				if(!TicUtil.isOccupied(x, y)) {
					pos = String.valueOf(x) + "," + String.valueOf(y);
				}
			}
		}
		
		return pos; // row 0, column 0
	}
	
	public static void doLogic() {
		System.out.println("Ai.doLogic()");
		OnePlayer.clickLocation(findBestMove());
	}
	
}
