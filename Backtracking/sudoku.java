public class sudoku {
public static boolean sudokuSolver(int s[][],int row,int col){
    //base case
    if(row == 9){
        return true;
    }

    //recursion
int nextrow = row, nextcol = col+1;
if(col+1 == 9){
    nextrow =row+1;
    nextcol = 0;
}
if(s[row][col] !=0){
    return sudokuSolver(s, nextrow, nextcol);
}

    for(int digit=1;digit<=9;digit++){
        if(isSafe(s,row,col,digit)){
            s[row][col]= digit;
            sudokuSolver(s, nextrow, nextcol){  //solution exist
                return true;
            }
            s[row][col] = 0;
        }
    }
    return false;
}
    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
    {4,9,0,1,5,7,0,0,2},
    {0,0,3,0,0,4,1,9,0},
    {1,8,5,0,6,0,0,2,0},
    {0,0,0,0,2,0,0,6,0},
    {9,6,0,4,0,5,3,0,0},
    {0,3,0,0,7,2,0,0,4},
    {0,4,9,0,3,0,0,5,7},
    {8,2,7,0,0,9,0,1,3}};
    }
}