package com.indpro.gameoflife.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.indpro.gameoflife.dataseed.OscillatorSeedImpl;
import com.indpro.gameoflife.dataseed.Seed;
import com.indpro.gameoflife.logic.LifeBoard;
import com.indpro.gameoflife.model.Cell;

/**
 * Unit test for Life Board
 * 
 * @author Kasturi.Hatti
 */
public class LifeBoardTest {

	private LifeBoard lifeBoard;

	/**
	 * JUnit test case for Life Board generation.
	 */
	@Before
	public void init() {
		int numOfRows = 3;
		int numOfColumns = 3;
		boolean[][] inputSeed = { { true, false, true }, { false, false, true }, { false, true, false } };

		Seed seed = new OscillatorSeedImpl();
		seed.setNumColumns(numOfColumns);
		seed.setNumRows(numOfRows);
		seed.setSeed(inputSeed);
		lifeBoard = new LifeBoard(seed);
	}

	/**
	 * JUnit test case for Life Board iteration.
	 */
	@Test
	public void tes_iterate() {
		lifeBoard.iterate();
	}

	/**
	 * JUnit test case to check if the cell is alive/dead.
	 */
	@Test
	public void test_isAlive_dead() {
		Cell cell = new Cell(1, 1);
		assertFalse(lifeBoard.isAlive(cell));
	}

	/**
	 * JUnit test case to check if the cell is alive/dead.
	 */
	@Test
	public void test_isAlive_alive() {
		Cell cell = new Cell(0, 0);
		assertTrue(lifeBoard.isAlive(cell));
	}

	/**
	 * JUnit test case to get number of rows of Life Board
	 */
	@Test
	public void test_getNumRows() {
		assertEquals(lifeBoard.getNumRows(), 3);
	}

	/**
	 * JUnit test case to get number of columns of Life Board
	 */
	@Test
	public void test_getNumColumns() {
		assertEquals(lifeBoard.getNumColumns(), 3);
	}
}
