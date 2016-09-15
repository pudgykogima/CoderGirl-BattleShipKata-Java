package org.codergirl.battleship;

import org.lambda.utils.Grid;

public class Board {

	private int width;
	private int height;
	private Ship[][] shipLocation;

	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		this.shipLocation = new Ship[width][height];
	}

	@Override
	public String toString() {
		return Grid.print(width, height, this::printCell);
	}

	private String printCell(int x, int y) {
		if (isShipPresent(x, y)) {
			return "D";
		} else {
			return ".";
		}
	}

	private boolean isShipPresent(int x, int y) {
		return shipLocation[x][y] == Ship.DESTROYER;
	}

	public void placePiece(Ship shipType, int x, int y, Orientation shipOrientation) {
		shipLocation[x][y] = shipType;
		if (shipOrientation == Orientation.VERTICAL) {
			shipLocation[x][y + 1] = shipType;

		} else {
			shipLocation[x + 1][y] = shipType;

		}

	}
}
