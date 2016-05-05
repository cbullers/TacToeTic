package com.cbullers.delegations;

import com.cbullers.gui.OnePlayer;
import com.cbullers.gui.TwoPlayer;

public class Delegator {

	public static void openOnePlayer() {
		OnePlayer.open();
	}
	
	public static void openTwoPlayer() {
		TwoPlayer.open();
	}
	
}
