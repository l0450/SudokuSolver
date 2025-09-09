# Sudoku Solver (Java) #

A simple yet efficient **Sudoku Solver** built in Java using a **backtracking algorithm**.  
This program can take a partially filled Sudoku board and solve it completely if a solution exists.  

---

## Features ##
- Solves any valid **9x9 Sudoku puzzle**.
- Uses a **recursive backtracking algorithm** for efficient solving.
- Validates moves by checking:
  - Row constraints  
  - Column constraints  
  - 3x3 subgrid constraints  
- Prints the solved board neatly in the console.
- Includes a line separator for boxes, rows, and columns.
- Provides a solution to boards with multiple difficulty levels (**EASY**, **MEDIUM**, **HARD**). 

---

## Project Structure ## 

- `main()` → Entry point of the program. It initializes the Sudoku board and calls the solver.  
- `solveTheBoard()` → Recursive backtracking method to solve the puzzle.  
- `isPlacementValid()` → Ensures numbers follow Sudoku rules.  
- `isNumberInRow()`, `isNumberInColumn()`, `isNumberInBox()` → Utility methods for validation.  
- `printTheBoard()` → This method prints the board to the console in a grid format.

---

## How to run the Sudoku Solver on your machine? ##

1. Clone or download this repository.  
2. Open a terminal in the project folder.  
3. Compile the program: javac SudokuSolver.java
4. Run the program: java SudokuSolver

---

## References ##

The only reference I used was the website below. The website generated some random Sudoku boards based on the level I chose.
Inside the **src** folder, you can check out what boards the website generated for me.

https://sudoku.com/



