package com.cbullers.config;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Config {

	/*
	 * Variable class, with all the crap
	 */
	
	// Splash screen
	public static Color SPLASH_BACKGROUND = Color.red;
	
	public static String APP_NAME = "ToeTacTic";
	
	public static int currentPlayer = 0; // 0 = x, 1 = o;
	
	public static List<String> WIN_COMBOS = new ArrayList<String>();
	
	public static String currentBoard = "c c c c c c c c c"; // what the board looks like
	
	public static char winner = 'c';
	
}
