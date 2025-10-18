
public class NQueensIsSafe {
    public static void NQueens(char Board[][],int row){
        // Base case 
        if(row == Board.length){
            count++;
            printBoard(Board);
            return;
        }
        for(int j=0; j<Board.length; j++){
            if(isSafe(Board,row,j)){
                Board[row][j] = 'Q';
                NQueens(Board, row+1);
                Board[row][j] = 'x';
            }
        }
    }
    public static void printBoard(char Board[][]){
        System.out.println("--------- ChessBoard -----------");
        for(int i=0; i<Board.length; i++){
            for(int j=0; j<Board.length; j++){
                System.out.print(Board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char Board[][],int row,int col){
        // Vertically up
        for(int i=row-1; i>=0; i--){
            if(Board[i][col]=='Q'){
                return false;
            }
        }

        // diagonal left up
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(Board[i][j] == 'Q'){
                return false;
            }
        }

        // diagonal right up
        for(int i=row-1,j=col+1; i>=0 && j<Board.length; i--,j++){
            if(Board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    static int count;
    public static void main(String[] args) {
        int n = 5;
        char Board[][] = new char[n][n];
        for(int i=0; i<Board.length; i++){
            for(int j=0; j<Board.length; j++){
                Board[i][j] = 'x';
            }
        }
        NQueens(Board, 0);
        System.out.println("Total Number of ways to solve N queens = "+count);
    }
}
