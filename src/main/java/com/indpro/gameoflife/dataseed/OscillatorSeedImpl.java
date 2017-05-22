package com.indpro.gameoflife.dataseed;

/**
 * Implementations for Life Board Seeds
 * 
 * @author Kasturi.Hatti
 *
 */
public class OscillatorSeedImpl implements Seed {

	private boolean[][] seed;

	private int numRows;
	private int numColumns;

	public int getNumRows() {
		return numRows;
	}

	public int getNumColumns() {
		return numColumns;
	}

	public boolean[][] getSeed() {
		return seed;
	}

	public void setNumColumns(int numColumns) {
		this.numColumns = numColumns;
	}

	public void setSeed(boolean[][] seed) {
		this.seed = seed;
	}

	public void setNumRows(int numRows) {
		this.numRows = numRows;
	}
}
