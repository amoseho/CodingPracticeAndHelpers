package src.test;

import org.junit.jupiter.api.Test;
import src.examSources.TicTacToe;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest
{

	@Test
	void addAndPrintTest()
	{
		TicTacToe ticTacToe = new TicTacToe();
		ticTacToe.addToken(0,0, "X");
		ticTacToe.printBoard();
	}
}