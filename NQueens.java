public class NQueens {
    public static void nQueens(char chessboard[][], int row){
        // Base case 
        if(row == chessboard.length){
            printChessboard(chessboard);
            return;
        }
        for(int j=0; j<chessboard.length; j++){
            chessboard[row][j] = 'Q';
            nQueens(chessboard, row+1); 
            chessboard[row][j] = 'X';    // backtracking 
        }
    }
    public static void printChessboard(char chessboard[][]){
        System.out.println("-------- ChessBoard -------------");
        for(int i=0; i<chessboard.length; i++){
            for(int j = 0; j<chessboard.length; j++){
                System.out.print(chessboard[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char chessboard[][] = new char[n][n];
        for(int i=0; i<chessboard.length; i++){
            for(int j=0; j<chessboard.length; j++){
                chessboard[i][j] = 'X';
            }
        }
        nQueens(chessboard, 0);
    }
}
