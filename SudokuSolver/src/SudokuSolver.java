public class SudokuSolver {
	
	// Initializing the number of columns and rows in a sudoku board
	private static final int gridsize = 9;
	
	public static void main (String[] args) {
		
		// This multidimensional array represents an actual sudoku board
		int[][] board = {
				{7, 0, 2, 0, 5, 0, 6, 0, 0},
				{0, 0, 0, 0, 0, 3, 0, 0, 0},
				{1, 0, 0, 0, 0, 9, 5, 0, 0},
				{8, 0, 0, 0, 0, 0, 0, 9, 0},
				{0, 4, 3, 0, 0, 0, 7, 5, 0},
				{0, 9, 0, 0, 0, 0, 0, 0, 8},
				{0, 0, 9, 7, 0, 0, 0, 0, 5},
				{0, 0, 0, 2, 0, 0, 0, 0, 0},
				{0, 0, 7, 0, 4, 0, 2, 0, 3}
		};
		
		// If-else statement sending the message if the board can be solved
		if(solveTheBoard(board)) {
			System.out.println("Sudoku has been solved successfully");
		} else {
			System.out.println("It is impossible to solve this board. We are really sorry");
		}

	}
		
		
	
	
	// A method for checking a specific number in a row
	private static boolean isNumberInRow(int[][] sudokuBoard, int number, int row) {
		for (int i = 0; i < gridsize; i++)  {
			if(sudokuBoard[row][i] == number) {
				return true;
			}
		}
		return false;
	}
	
	// A method for checking a specific number in a column
	private static boolean isNumberInColumn(int[][] sudokuBoard, int number, int column) {
		for (int i = 0; i < gridsize; i++)  {
			if(sudokuBoard[i][column] == number) {
				return true;
			}
		}
		return false;
	}
	
	// A method for checking if a specific number is in a box
	private static boolean isNumberInBox(int[][] sudokuBoard, int number, int row, int column) {
		int boxRow = row - row % 3;
		int boxColumn = column - column % 3;
		for (int i = boxRow; i < boxRow + 3; i++)  {
			for(int j = boxColumn; j < boxColumn + 3; j++) {
				if(sudokuBoard[i][j] == number) {
					return true;
				}
			}
		}
		return false;
	}
	
	// isPlacementValid() returns if the number is in the valid place
	private static boolean isPlacementValid(int[][] sudokuBoard, int number, int row, int column) {
		return !isNumberInRow(sudokuBoard, number, row) && !isNumberInColumn(sudokuBoard, number, column)
				&& !isNumberInBox(sudokuBoard, number, row, column);
	}
	
	/* This method uses a backtracking algorithm to solve Sudoku by recursively
	 * trying different numbers in different cells. All the necessary methods
	 * should be done by now, now we can update the main method under an actual
	 * Sudoku board. */
	private static boolean solveTheBoard(int[][] sudokuBoard) {
		for (int row = 0; row < gridsize; row++)  {
			for (int column = 0; column < gridsize; column++)  {
				if(sudokuBoard[row][column] == 0) {
					for(int givenNumber = 1; givenNumber <= gridsize; givenNumber++) {
						if(isPlacementValid(sudokuBoard, givenNumber, row, column)) {
							sudokuBoard[row][column] = givenNumber;
							
							if(solveTheBoard(sudokuBoard)) {
								return true;
							} else {
								sudokuBoard[row][column] = 0;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}

}