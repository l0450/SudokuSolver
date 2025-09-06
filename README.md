# 🧩 Sudoku Solver (Java)

A simple yet efficient **Sudoku Solver** built in Java using a **backtracking algorithm**.  
This program can take a partially filled Sudoku board and solve it completely if a solution exists.  

---

## 📖 Features
- Solves any valid **9x9 Sudoku puzzle**.
- Uses a **recursive backtracking algorithm** for efficient solving.
- Validates moves by checking:
  - Row constraints  
  - Column constraints  
  - 3x3 subgrid constraints  
- Prints the solved board neatly in the console.

---

## 📂 Project Structure

- `main()` → Entry point of the program. Initializes the Sudoku board and calls the solver.  
- `solveTheBoard()` → Recursive backtracking method to solve the puzzle.  
- `isPlacementValid()` → Ensures numbers follow Sudoku rules.  
- `isNumberInRow()`, `isNumberInColumn()`, `isNumberInBox()` → Utility methods for validation.  
- `printTheBoard()` → Prints the board to the console in a grid format.

---

### ✅ Resources
- Java JDK 8 or higher installed
- Basic knowledge of running Java programs

