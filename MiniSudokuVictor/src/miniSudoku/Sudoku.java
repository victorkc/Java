package miniSudoku;

public class Sudoku {

	// dimension of input
	static int N = 4;

	public static int getN() {
		return N;
	}

	public static void setN(int n) {
		N = n;
	}

	// sample input
	
	static int grid[][] = { { 2, 0, 0, 0}, //
							{ 0, 3, 0, 4}, //
							{ 3, 0, 0, 1}, //
							{ 4, 0, 3, 0} };					
	
	static int gridManual[][] = { { 2, 0, 0, 0}, //
							 	  { 0, 3, 0, 4}, //
							 	  { 3, 0, 0, 1}, //
							 	  { 4, 0, 3, 0} };
	
	static int gridSolucion[][] = { { 2, 4, 1, 3}, //
		 	  					    { 1, 3, 2, 4}, //
		 	  					    { 3, 2, 4, 1}, //
		 	  					    { 4, 1, 3, 2} };
			
	


	public static int[][] getGrid() {
		return grid;
	}

	public static void setGrid(int[][] grid) {
		Sudoku.grid = grid;
	}

	/**
	 * Utility function to check whether @param value is valid for @param cell
	 */

	static boolean isValid(Cell cell, int value) {

		if (grid[cell.row][cell.col] != 0) {
			throw new RuntimeException("Cannot call for cell which already has a value");
		}

		// if v present row, return false
		for (int c = 0; c < 4; c++) {
			if (grid[cell.row][c] == value)
				return false;
		}

		// if v present in col, return false
		for (int r = 0; r < 4; r++) {
			if (grid[r][cell.col] == value)
				return false;
		}

		// if v present in grid, return false

		// to get the grid we should calculate (x1,y1) (x2,y2)
		int x1 = 2 * (cell.row / 2);
		int y1 = 2 * (cell.col / 2);
		int x2 = x1 + 1;
		int y2 = y1 + 1;

		for (int x = x1; x <= x2; x++)
			for (int y = y1; y <= y2; y++)
				if (grid[x][y] == value)
					return false;

		// if value not present in row, col and bounding box, return true
		return true;
	}

	// simple function to get the next cell
	// read for yourself, very simple and straight forward
	static Cell getNextCell(Cell cur) {

		int row = cur.row;
		int col = cur.col;

		// next cell => col++
		col++;

		// if col > 8, then col = 0, row++
		// reached end of row, got to next row
		if (col > 3) {
			// goto next line
			col = 0;
			row++;
		}

		// reached end of matrix, return null
		if (row > 3)
			return null; // reached end

		Cell next = new Cell(row, col);
		return next;
	}

	// everything is put together here
	// very simple solution
	// must return true, if the soduku is solved, return false otherwise
	public boolean solve(Cell cur) {

		// if the cell is null, we have reached the end
		if (cur == null)
			return true;

		// if grid[cur] already has a value, there is nothing to solve here,
		// continue on to next cell
		if (grid[cur.row][cur.col] != 0) {
			// return whatever is being returned by solve(next)
			// i.e the state of soduku's solution is not being determined by
			// this cell, but by other cells
			return solve(getNextCell(cur));
		}

		// this is where each possible value is being assigned to the cell, and
		// checked if a solutions could be arrived at.

		// if grid[cur] doesn't have a value
		// try each possible value
		for (int i = 1; i <= 4; i++) {
			// check if valid, if valid, then update
			boolean valid = isValid(cur, i);

			if (!valid) // i not valid for this cell, try other values
				continue;

			// assign here
			grid[cur.row][cur.col] = i;

			// continue with next cell
			boolean solved = solve(getNextCell(cur));
			// if solved, return, else try other values
			if (solved)
				return true;
			else
				grid[cur.row][cur.col] = 0; // reset
			// continue with other possible values
		}

		// if you reach here, then no value from 1 - 9 for this cell can solve
		// return false
		return false;
	}
}
