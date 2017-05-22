package com.indpro.gameoflife.client;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import com.indpro.gameoflife.dataseed.OscillatorSeedImpl;
import com.indpro.gameoflife.dataseed.Seed;
import com.indpro.gameoflife.logic.BoardPrinter;
import com.indpro.gameoflife.logic.LifeBoard;

/**
 * Class contains main method to start the Life Board execution
 * 
 * @author Kasturi.Hatti
 */
public class GameOfLife {

	public static void main(String[] args) {
		try {
			System.out.println("--------Welcome To GAME OF LIFE---------\n");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter number of rows of the array");
			int rows = scanner.nextInt();
			System.out.println("Please enter number of columns of the array");
			int columns = scanner.nextInt();
			System.out.println("Please enter number of Iterations");
			int iterations = scanner.nextInt();
			
			// start life board execution
			gameOfLife(rows, columns, iterations);
		} catch (InputMismatchException e) {
			System.out.println("Please enter number of rows, columns and iterations");
			main(null);
		}
	}

	/**
	 * method generates the boolean random array with number of row, columns
	 * passed
	 * 
	 * @param row
	 *            life board row
	 * @param column
	 *            life board column
	 * @return random boolean array
	 * 
	 */
	private static boolean[][] getBooleanArray(int row, int column) {
		Random random = new Random();
		boolean[][] arr = new boolean[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = random.nextBoolean();
			}
		}
		return arr;
	}

	/**
	 * method to implement life board execution.
	 * 
	 * @param rows
	 *            life board row
	 * @param columns
	 *            life board column
	 * @param iterations
	 *            life board iterations
	 */
	public static void gameOfLife(int rows, int columns, int iterations) {
		boolean[][] inputSeed = getBooleanArray(rows, columns);
		System.out.println("Setting up initial life board\n");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				BoardPrinter.printCell(inputSeed[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nInitial setup is completed\n");

		Seed seed = new OscillatorSeedImpl();
		seed.setNumColumns(columns);
		seed.setNumRows(rows);
		seed.setSeed(inputSeed);
		LifeBoard lifeBoard = new LifeBoard(seed);
		int count = 0;
		while (count < iterations) {
			count++;
			lifeBoard.iterate();
			BoardPrinter.print(lifeBoard, count);
		}
	}
}
