package LeetCode;

public class Leetcode73 {
    public static void setZero(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    dfs(matrix, i, j);
                }
            }
        }
    }

    public static void dfs(int arr[][],int row,int col){
        if(row<0 || row>=arr.length || col<0 || col>=arr[0].length){
            return;
        }
        if(arr[row][col] == 1){
            arr[row][col] = 0;
        }
        dfs(arr, row-1, col);
        dfs(arr, row+1, col);
        dfs(arr, row, col-1);
        dfs(arr, row, col+1);
    }

    public static void printArray(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[][] = {{1,1,1},{1,0,1},{1,1,1}};
        setZero(arr);
        printArray(arr);
    }
}