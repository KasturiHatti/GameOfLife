package com.indpro.gameoflife.logic;

import com.indpro.gameoflife.dataseed.Seed;
import com.indpro.gameoflife.model.Cell;
import com.indpro.gameoflife.model.Direction;

/**
 * Business Logic for Game of Life implementation.
 * 
 * @author Kasturi.Hatti
 */
public class LifeBoard {

	private final boolean[][] oldState;
	private final boolean[][] newState;
	private final int numRows, numColumns;

	/**
	 * parameterized constructor.
	 * 
	 * @param seed
	 */
	public LifeBoard(Seed seed) {
		numRows = seed.getNumRows();
		numColumns = seed.getNumColumns();
		oldState = new boolean[numRows][numColumns];
		newState = new boolean[numRows][numColumns];
		for (int row = 0; row < seed.getNumRows(); row++) {
			System.arraycopy(seed.getSeed()[row], 0, oldState[row], 0, seed.getNumColumns());
		}
	}

	/**
	 * Updates the current cell status and copy the cell status to the old cell.
	 */
	public void iterate() {
		updateCells();
		copyNewToOld();
	}

	/**
	 * Copies the new cell to old.
	 */
	private void copyNewToOld() {
		for (int row = 0; row < numRows; row++) {
			System.arraycopy(newState[row], 0, oldState[row], 0, numColumns);
		}
	}

	/**
	 * Updates the status of cells.
	 */
	private void updateCells() {
		Cell currentCell = new Cell(0, 0);
		for (currentCell.row = 0; currentCell.row < numRows; currentCell.row++) {
			for (currentCell.column = 0; currentCell.column < numColumns; currentCell.column++) {
				updateCell(currentCell);
			}
		}
	}

	/**
	 * Method updates the status of Cell {cell} based on neighbor cells status.
	 * 
	 * @param cell
	 *            input cell
	 */
	private void updateCell(Cell cell) {
		final int numLivingNeighbors = numLivingNeighbors(cell);
		updateCellWithNeighbors(cell, numLivingNeighbors);
	}

	/**
	 * 
	 * @param cell
	 *            input cell
	 * @return number of live neighbors for the input Cell {cell}.
	 */
	private int numLivingNeighbors(Cell cell) {
		int numLivingNeighbors = 0;
		for (Direction direction : Direction.values()) {
			if (isNeighborAlive(cell, direction)) {
				numLivingNeighbors++;
			}
		}
		return numLivingNeighbors;
	}

	/**
	 * input cell, find the neighbor with input direction and check if the
	 * particular neighbor is alive.
	 * 
	 * @param cell
	 *            input cell
	 * @param direction
	 *            direction of the cell
	 * @return
	 */
	private boolean isNeighborAlive(Cell cell, Direction direction) {
		final Cell neighborCell = cell.getNeighbor(direction);
		if (isInBounds(neighborCell)) {
			return isAlive(neighborCell);
		} else {
			return false;
		}
	}

	/**
	 * check if the neighbor cell is in bound.
	 * 
	 * @param cell
	 * @return
	 */
	private boolean isInBounds(Cell cell) {
		final boolean isRowInBounds = (cell.row >= 0) && (cell.row < numRows);
		final boolean isColumnInBounds = (cell.column >= 0) && (cell.column < numColumns);
		return isRowInBounds && isColumnInBounds;
	}

	/**
	 * checks if the input cell lives on to next generation or dies.
	 * 
	 * @param cell
	 *            input Cell {cell}
	 * @param numLivingNeighbors
	 *            number of live neighbors for the current cell
	 */
	private void updateCellWithNeighbors(Cell cell, int numLivingNeighbors) {
		if (isAlive(cell)) {
			if (numLivingNeighbors < 2) {
				// cell with fewer than two live neighbors dies because of under
				// population.
				clearCell(cell);
			} else if (numLivingNeighbors > 3) {
				// cell with more than three live neighbors dies because of over
				// population.
				clearCell(cell);
			} else {
				// cell with two or three live neighbors lives on to the next
				// generation.
				setCell(cell);
			}
		} else if (numLivingNeighbors == 3) {
			// any dead cell with exact three live neighbors lives on to the
			// next generation.
			setCell(cell);
		} else {
			clearCell(cell);
		}
	}

	private void setCell(Cell cell) {
		newState[cell.row][cell.column] = true;
	}

	private void clearCell(Cell cell) {
		newState[cell.row][cell.column] = false;
	}

	public boolean isAlive(Cell cell) {
		return isAlive(cell.row, cell.column);
	}

	private boolean isAlive(int row, int column) {
		return oldState[row][column];
	}

	public int getNumRows() {
		return numRows;
	}

	public int getNumColumns() {
		return numColumns;
	}
}
