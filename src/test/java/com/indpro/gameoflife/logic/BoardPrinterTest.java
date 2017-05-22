package com.indpro.gameoflife.logic;

import org.junit.Before;
import org.junit.Test;

import com.indpro.gameoflife.dataseed.OscillatorSeedImpl;
import com.indpro.gameoflife.dataseed.Seed;
import com.indpro.gameoflife.logic.BoardPrinter;
import com.indpro.gameoflife.logic.LifeBoard;

/**
 * Unit test for Life Board Printer.
 * 
 * @author Kasturi.Hatti
 */
public class BoardPrinterTest {
	private LifeBoard lifeBoard;

	/**
	 * JUnit test case for Life Board Printer.
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
	 * JUnit test case for Board Printer print method.
	 */
	@Test
	public void test_boardPrinter_print() {
		BoardPrinter.print(lifeBoard, 0);
	}

	/**
	 * JUnit test case for Board Printer print cell method.
	 */
	@Test
	public void test_boardPrinter_printCell() {
		BoardPrinter.printCell(true);
		BoardPrinter.printCell(false);
	}

}
