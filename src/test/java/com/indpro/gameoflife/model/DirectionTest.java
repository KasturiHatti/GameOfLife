package com.indpro.gameoflife.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.indpro.gameoflife.model.Direction;

/**
 * Unit test for Neighbor Cell Direction.
 * 
 * @author Kasturi.Hatti
 */
public class DirectionTest {

	/**
	 * JUnit test case for Neighbor Cell column change.
	 */
	@Test
	public void test_directionColumnChange() {
		assertEquals(0, Direction.DOWN.getColumnChange());
	}

	/**
	 * JUnit test case for Neighbor Cell row change.
	 */
	@Test
	public void test_directionRowChange() {
		assertEquals(1, Direction.DOWN.getRowChange());
	}
}
