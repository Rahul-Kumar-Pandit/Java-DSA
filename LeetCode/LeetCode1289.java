package LeetCode;

public class LeetCode1289 {
    public static int minimum(int grid[][]){
        // int result = 0;
        int min = Integer.MAX_VALUE;
        // for(int i=0; i<grid.length; i++){
        //     for(int j=0; j<grid[0].length; j++){
        //         if(grid[i][j]<min){
        //             min = grid[i][j];
        //         }
        //     }
        //     result += min;
        //     min = Integer.MAX_VALUE;
        // }
        // return result;

        for(int col = 0; col<grid.length; col++){
            min = Math.min(min,helper(0,col,grid));
        }
        return min;
    }

    public static int helper(int row,int col,int[][]grid){
        if(row == grid.length-1){
            return grid[row][col];
        }

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<grid[0].length; i++){
            if(i != col){
                ans = Math.min(ans,helper(row+1, i, grid));
            }
        }
        return ans + grid[row][col];
    }

    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(minimum(grid));
    }
}