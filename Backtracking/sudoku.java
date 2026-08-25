public class sudoku {

    public static boolean sudokuSolver(int s[][], int row, int col) {

        // Base case
        if (row == 9) {
            return true;
        }

        // Find next cell
        int nextrow = row;
        int nextcol = col + 1;

        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }

        // If cell is already filled
        if (s[row][col] != 0) {
            return sudokuSolver(s, nextrow, nextcol);
        }

        // Try digits 1 to 9
        for (int digit = 1; digit <= 9; digit++) {

            if (isSafe(s, row, col, digit)) {

                // Place digit
                s[row][col] = digit;

                // Recursively solve
                if (sudokuSolver(s, nextrow, nextcol)) {
                    return true;
                }

                // Backtrack
                s[row][col] = 0;
            }
        }

        return false;
    }

    public static boolean isSafe(int s[][], int row, int col, int digit) {

        // Check column
        for (int i = 0; i < 9; i++) {
            if (s[i][col] == digit) {
                return false;
            }
        }

        // Check row
        for (int j = 0; j < 9; j++) {
            if (s[row][j] == digit) {
                return false;
            }
        }

        // Check 3 x 3 box
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {

                if (s[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void printSudoku(int s[][]) {

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                System.out.print(s[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int sudoku[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution:");
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists.");
        }
    }
}