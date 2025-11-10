package SWAYAM;

public class SudokuProblem {
    public static void main(String[] args) {

    }
    public void solveSudoku(char[][] board) {
        sudokuSolver(board);
    }
    public boolean sudokuSolver(char[][] board){
        int n=board.length;
        int r=-1;
        int c=-1;
        boolean check=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    r=i;
                    c=j;
                    check=false;
                    break;
                }
            }
            if(check==false){
                break;
            }
        }
        if(check==true){
            return true;
        }
        for(int k=1;k<=9;k++){
            if(isSafe(board,r,c,k)){
                board[r][c]=(char)(k+'0');
                if(sudokuSolver(board)){
                    return true;
                }else{
                    board[r][c]='.';
                }
            }
        }
        return false;
    }
    public boolean isSafe(char[][] board,int row,int col,int index){
        for(int i=0;i<board.length;i++) {
            if (board[i][col] == (char)index+'0') {
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[row][i]==(char)index+'0'){
                return false;
            }
        }
        int sqrt=(int)(Math.sqrt(board.length));
        int rowlim=row-row%sqrt     ;
        int collim=col-col%sqrt;
        for(int i=rowlim;i<rowlim+sqrt;i++){
            for(int j=collim;j<collim+sqrt;j++){
                if(board[i][j]==(char)index+'0'){
                    return false;
                }
            }
        }
        return true;
    }
}
