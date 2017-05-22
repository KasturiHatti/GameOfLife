package com.indpro.gameoflife.model;

/**
 * Cell represents the seed.
 * 
 * @author Kasturi.Hatti
 */
public class Cell {
	public int row;
	public int column;

	public Cell(int row, int column) {
		this.row = row;
		this.column = column;
	}

	/**
	 * method returns Neighbor cell for current cell.
	 * 
	 * @param direction
	 * @return Neighbor cell
	 * 
	 */
	public Cell getNeighbor(Direction direction) {
		return new Cell(row + direction.getRowChange(), column + direction.getColumnChange());
	}
}
