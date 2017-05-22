package com.indpro.gameoflife.dataseed;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.indpro.gameoflife.dataseed.OscillatorSeedImpl;
import com.indpro.gameoflife.dataseed.Seed;

/**
 * Unit test for Oscillator seed implementations.
 * 
 * @author Kasturi.Hatti
 */
public class OscillatorSeedImplTest {

	private Seed seed;

	/**
	 * JUnit test case for initial seed
	 */
	@Before
	public void init() {
		seed = new OscillatorSeedImpl();
		seed.setNumColumns(2);
		seed.setNumRows(2);
		seed.setSeed(new boolean[][] { { true, false }, { false, true } });
	}

	/**
	 * JUnit test case for number of columns of the Life Board
	 */
	@Test
	public void test_getNumColumns() {
		assertEquals(2, seed.getNumColumns());
	}

	/**
	 * JUnit test case for number of rows of the Life Board
	 */
	@Test
	public void test_getNumRows() {
		assertEquals(2, seed.getNumRows());
	}

	/**
	 * JUnit test case for Life Board seed.
	 */
	@Test
	public void test_getSeed() {
		boolean[][] seed2 = seed.getSeed();

		assertEquals(true, seed2[0][0]);
		assertEquals(false, seed2[0][1]);
		assertEquals(false, seed2[1][0]);
		assertEquals(true, seed2[1][1]);
	}
}
