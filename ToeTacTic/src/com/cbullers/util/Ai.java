package com.cbullers.util;

import com.cbullers.config.Config;
import com.cbullers.gui.OnePlayer;

public class Ai {
	
	// Define all variables private, the player is def a hacker
	private static String findBestMove() {
		
		char[][] playerBoard = TicUtil.copy(Config.currentBoard); // Where the players pieces are
		playerBoard = TicUtil.replaceAll(playerBoard, ((Config.aiChar == 'x') ? 'o' : 'x'), 'x');
		
		return "0,0"; // row 0, column 0
	}
	
	public static void doLogic() {
		OnePlayer.clickLocation(findBestMove());
	}
	
}
