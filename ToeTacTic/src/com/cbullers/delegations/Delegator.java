package com.cbullers.delegations;

import com.cbullers.config.Config;
import com.cbullers.gui.OnePlayer;
import com.cbullers.gui.TwoPlayer;
import com.cbullers.util.TicUtil;

public class Delegator {

	public static void openOnePlayer() {
		OnePlayer.open();
	}
	
	public static void openTwoPlayer() {
		TwoPlayer.open();
	}
	
	public static boolean checkWinner() {
		
		// Check x first
		char[][] checkBoard = TicUtil.copy(Config.currentBoard);
		checkBoard = TicUtil.replaceAll(checkBoard, 'o', 'c');
		// Check
		if(checkBoard[0][0] == 'x') {
			if(checkBoard[0][1] == 'x') {
				if(checkBoard[0][2] == 'x') {
					// x wins
					xWins();
					return true;
				}
			}else if(checkBoard[1][0] == 'x') {
				if(checkBoard[2][0] == 'x') {
					xWins();
					return true;
				}
			}else if(checkBoard[1][1] == 'x') {
				if(checkBoard[2][2] == 'x') {
					xWins();
					return true;
				}
			}
		}
		if(checkBoard[0][1] == 'x') {
			if(checkBoard[1][1] == 'x') {
				if(checkBoard[2][1] == 'x') {
					xWins();
					return true;
				}
			}
		}
		if(checkBoard[0][2] == 'x') {
			if(checkBoard[1][2] == 'x') {
				if(checkBoard[2][2] == 'x') {
					xWins();
					return true;
				}
			}else if(checkBoard[1][1] == 'x') {
				if(checkBoard[2][0] == 'x') {
					xWins();
					return true;
				}
			}
		}
		if(checkBoard[1][0] == 'x') {
			if(checkBoard[1][1] == 'x') {
				if(checkBoard[1][2] == 'x') {
					xWins();
					return true;
				}
			}
		}
		if(checkBoard[2][0] == 'x') {
			if(checkBoard[2][1] == 'x') {
				if(checkBoard[2][2] == 'x') {
					xWins();
					return true;
				}
			}
		}
		
		// Check o
		char[][] checkBoard1 = TicUtil.copy(Config.currentBoard);
		checkBoard1 = TicUtil.replaceAll(checkBoard1, 'x', 'c');
		checkBoard1 = TicUtil.replaceAll(checkBoard1, 'o', 'x');
		// Check
		if(checkBoard1[0][0] == 'x') {
			if(checkBoard1[0][1] == 'x') {
				if(checkBoard1[0][2] == 'x') {
					// x wins
					oWins();
					return true;
				}
			}else if(checkBoard1[1][0] == 'x') {
				if(checkBoard1[2][0] == 'x') {
					oWins();
					return true;
				}
			}else if(checkBoard1[1][1] == 'x') {
				if(checkBoard1[2][2] == 'x') {
					oWins();
					return true;
				}
			}
		}
		if(checkBoard1[0][1] == 'x') {
			if(checkBoard1[1][1] == 'x') {
				if(checkBoard1[2][1] == 'x') {
					oWins();
					return true;
				}
			}
		}
		if(checkBoard1[0][2] == 'x') {
			if(checkBoard1[1][2] == 'x') {
				if(checkBoard1[2][2] == 'x') {
					oWins();
					return true;
				}
			}else if(checkBoard1[1][1] == 'x') {
				if(checkBoard1[2][0] == 'x') {
					oWins();
					return true;
				}
			}
		}
		if(checkBoard1[1][0] == 'x') {
			if(checkBoard1[1][1] == 'x') {
				if(checkBoard1[1][2] == 'x') {
					oWins();
					return true;
				}
			}
		}
		if(checkBoard1[2][0] == 'x') {
			if(checkBoard1[2][1] == 'x') {
				if(checkBoard1[2][2] == 'x') {
					oWins();
					return true;
				}
			}
		}
		
		return false;
	}
	
	private static void xWins() {
		Config.winner = 'x';
	}
	
	private static void oWins() {
		Config.winner = 'o';
	}
}
