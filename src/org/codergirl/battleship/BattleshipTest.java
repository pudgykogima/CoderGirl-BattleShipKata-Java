package org.codergirl.battleship;

import org.approvaltests.Approvals;
import org.junit.Test;

public class BattleshipTest {

	@Test
	public void testDestroyerIsPresent() throws Exception {
		Board board = new Board(5, 7);

		board.placePiece(Ship.DESTROYER, 3, 2, Orientation.HORIZONTAL);
		Approvals.verify(board);
	}

	@Test
	public void testDestroyerIsPresentVertically() throws Exception {
		Board board = new Board(5, 7);

		board.placePiece(Ship.DESTROYER, 3, 1, Orientation.VERTICAL);
		Approvals.verify(board);
	}

}
