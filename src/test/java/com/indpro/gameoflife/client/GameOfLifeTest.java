package com.indpro.gameoflife.client;

import org.junit.Test;

/**
 * @author Kasturi.Hatti
 */
public class GameOfLifeTest {
	
	@Test
	public void test_gameOfLife_main() {
		int numOfRows = 3;
		int numOfColumns = 3;
		int numOfIterations = 3;

		GameOfLife.gameOfLife(numOfRows, numOfColumns, numOfIterations);
	}
}
