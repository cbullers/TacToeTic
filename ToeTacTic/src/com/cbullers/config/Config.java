package com.cbullers.config;

import java.awt.Color;

public class Config {

	/*
	 * Variable class, with all the crap
	 */
	
	// Splash screen
	
	public static Color SPLASH_BACKGROUND = Color.red;
	
	public static String APP_NAME = "ToeTacTic";
	
	// Other
	
	public static int currentPlayer = 0; // 0 = x, 1 = o
	
	public static char[][] currentBoard = {{'c','c','c'},{'c','c','c'},{'c','c','c'}};
	
	public static char winner = 'c';
	
	// Singleplayer specific stuff
	public static boolean singleplayer;
	
	public static char aiChar;
	
	public static boolean isPlayersTurn;
	
}
