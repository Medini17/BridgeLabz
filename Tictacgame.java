/**
 * 
 */
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:Write   a   Program   to   play   a   Cross   Game   or   Tic­Tac­Toe   Game.   Player   1   
 * is the   Computer   and   the   Player   2   is   the   user.   Player   1   take   Random   Cell 
 * that   is   the Column   and   Row. 
 */
public class Tictacgame {
	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		Utility u = new Utility();
		int x = 0, y = 0;
		do {
			System.out.println(t.player == t.X ? "your turn" : "computer's turn");
			System.out.println("Enter x and y index");
			x = u.inputInteger();
			y = u.inputInteger();
			t.putSign(x, y);
			System.out.println(t.toString());
			System.out.println(" ");
			t.displayWinner();
		} while (t.isEmpty);
	}
}

class TicTacToe {
	public static final int X = 1, O = -1;
	public static final int EMPTY = 0;
	public int player = X;
	private int[][] board = new int[3][3];
	public boolean isEmpty = false;

	/** Puts an X or O mark at position i,j. */
	public void putSign(int x, int y) {
		if (x < 0 || x > 2 || y < 0 || y > 2) {
			System.out.println("Invalid board position");
			return;
		}
		if (board[x][y] != EMPTY) {
			System.out.println("Board position occupied");
			return;
		}
		board[x][y] = player; // place the mark for the current player
		player = -player; // switch players (uses fact that O = - X)
	}

	/** Checks whether the board configuration is a win for the given player. */
	public boolean isWin(int player) {
		return ((board[0][0] + board[0][1] + board[0][2] == player * 3)
				|| (board[1][0] + board[1][1] + board[1][2] == player * 3)
				|| (board[2][0] + board[2][1] + board[2][2] == player * 3)
				|| (board[0][0] + board[1][0] + board[2][0] == player * 3)
				|| (board[0][1] + board[1][1] + board[2][1] == player * 3)
				|| (board[0][2] + board[1][2] + board[2][2] == player * 3)
				|| (board[0][0] + board[1][1] + board[2][2] == player * 3)
				|| (board[2][0] + board[1][1] + board[0][2] == player * 3));
	}

	/** display the winning player or indicate a tie (or unfinished game). */
	public void displayWinner() {
		if (isWin(X)) {
			System.out.println("\n you won the game...!!");
			isEmpty = false;
		} else if (isWin(O)) {
			System.out.println("\n computer won the game...!!");
			isEmpty = false;
		} else {
			if (!isEmpty) {
				System.out.println("its a tie");
			}
		}
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		isEmpty = false;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				switch (board[i][j]) {
				case X:
					s.append(" X ");
					break;
				case O:
					s.append(" O ");
					break;
				case EMPTY:
					s.append("   ");
					isEmpty = true;
					break;
				}
				if (j < 2) {
					s.append("|");
				}

			}
			if (i < 2) {
				s.append("\n-----------\n");
			}
		}
		return s.toString();
	}
}
