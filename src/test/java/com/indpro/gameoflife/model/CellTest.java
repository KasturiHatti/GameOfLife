package com.indpro.gameoflife.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.indpro.gameoflife.model.Cell;
import com.indpro.gameoflife.model.Direction;

/**
 * Unit test for Life Board Cell.
 * 
 * @author Kasturi.Hatti
 */
public class CellTest {

	/**
	 * JUnit test case for down Neighbor Cell
	 */
	@Test
	public void test_getNeighbor_down() {
		Cell cell = new Cell(1, 2);
		Cell neighborCell = cell.getNeighbor(Direction.DOWN);

		assertEquals(2, neighborCell.row);
		assertEquals(2, neighborCell.column);
	}

	/**
	 * JUnit test case for upper Neighbor Cell
	 */
	@Test
	public void test_getNeighbor_upper() {
		Cell cell = new Cell(1, 2);
		Cell neighborCell = cell.getNeighbor(Direction.UP);

		assertEquals(0, neighborCell.row);
		assertEquals(2, neighborCell.column);
	}

	/**
	 * JUnit test case for left upper Neighbor Cell
	 */
	@Test
	public void test_getNeighbor_left_upper() {
		Cell cell = new Cell(1, 2);
		Cell neighborCell = cell.getNeighbor(Direction.UP_LEFT);

		assertEquals(0, neighborCell.row);
		assertEquals(1, neighborCell.column);
	}
}
