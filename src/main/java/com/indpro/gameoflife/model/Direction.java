package com.indpro.gameoflife.model;

/**
 * Enum class which contains the position of neighbor cells.
 * 
 * @author Kasturi.Hatti
 *
 */
public enum Direction {

	RIGHT(1, 0),
	LEFT(-1, 0),
	DOWN(0, 1),
	UP(0, -1),
	UP_RIGHT(1, -1),
	UP_LEFT(-1, -1),
	DOWN_RIGHT(1, 1),
	DOWN_LEFT(-1, 1);
	private final int columnChange;
	private final int rowChange;

	private Direction(int columnChange, int rowChange) {
		this.columnChange = columnChange;
		this.rowChange = rowChange;
	}

	public int getColumnChange() {
		return columnChange;
	}

	public int getRowChange() {
		return rowChange;
	}

}
