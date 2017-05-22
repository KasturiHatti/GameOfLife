package com.indpro.gameoflife.logic;

import com.indpro.gameoflife.model.Cell;

/**
 * Prints the Life Board cells
 * 
 * @author Kasturi.Hatti
 * 
 */
public class BoardPrinter {

	/**
	 * method which prints the status of life board cells.
	 * 
	 * @param lifeBoard
	 *            input Life Board
	 * @param iterationNum
	 *            input number of iterations
	 */
	public static void print(LifeBoard lifeBoard, int iterationNum) {
		final int numRowsPrinted = lifeBoard.getNumRows();
		final int numColumns = lifeBoard.getNumColumns();

		Cell currentCell = new Cell(0, 0);
		System.out.println("Printing cells after iteration  " + iterationNum + "\n");
		for (currentCell.row = 0; currentCell.row < numRowsPrinted; currentCell.row++) {
			for (currentCell.column = 0; currentCell.column < numColumns; currentCell.column++) {
				final boolean isAlive = lifeBoard.isAlive(currentCell);
				printCell(isAlive);
			}
			System.out.println();
		}
		System.out.println("\n");
	}

	/**
	 * Checks seed cell status and prints the same
	 * 
	 * @param isAlive
	 *            true or false
	 */
	public static void printCell(boolean isAlive) {
		if (isAlive) {
			System.out.print("alive ");
		} else {
			System.out.print("dead  ");
		}
	}
}
