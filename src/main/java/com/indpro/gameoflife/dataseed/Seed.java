package com.indpro.gameoflife.dataseed;

/**
 * Interface which operates on life board seeds.
 * 
 * @author Kasturi.Hatti
 */
public interface Seed {

	int getNumRows();

	int getNumColumns();

	boolean[][] getSeed();

	void setNumColumns(int numColumns);

	void setSeed(boolean[][] seed);

	void setNumRows(int numRows);
}
