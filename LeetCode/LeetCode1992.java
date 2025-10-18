package LeetCode;
import java.util.*;

// Good Question of LeetCode 1992


// ************************* Approach 1 for BFS *****************

/* class LeetCode1992 {
    private final int[][] directions = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    public int[][] findFarmland(int[][] land) {
        int row = land.length;
        int col = land[0].length;
        List<int[]> result = new ArrayList<>();
        boolean[][] visited = new boolean[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(!visited[i][j] && land[i][j] == 1){
                    int coordinates[] = new int[]{i,j,0,0};
                    bfs(land,visited,coordinates,i,j);
                    result.add(coordinates);
                }
            }
        }
        return result.toArray(new int[result.size()][4]);
    }

    public void bfs(int[][] land,boolean visited[][],int coordinates[],int i,int j){
        visited[i][j] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});

        while(!queue.isEmpty()){
            // We will poll out the current front element and explore 
            // the 4 directions
            int curr[] = queue.poll();

            for(int []dir : directions ){
                int newX = curr[0] + dir[0];
                int newY = curr[1] + dir[1];

                // We need to check for the boundry conditions
                if(newX < 0 || newX >= land.length || newY < 0 ||
                newY >= land[0].length || visited[newX][newY] || land[newX][newY] == 0){
                    continue;
                }
                visited[newX][newY] = true;
                queue.add(new int[] {newX,newY});
            }
            coordinates[2] = Math.max(coordinates[2],curr[0]);
            coordinates[3] = Math.max(coordinates[3],curr[1]);
        }
    }
} */



class LeetCode1992 {
    public int[][] findFarmland(int[][] land) {
        ArrayList<int[]> list = new ArrayList<>();
        int m = land.length;
        int n = land[0].length;
        int[][] result = new int[m][n]; //Extra line added for remove error
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(land[i][j] == 1){
                    int arr[] = new int[4];
                    arr[0] = i;
                    arr[1] = j;

                    int r = i;
                    int c = j;
                    for(r=i; r<m && land[r][j] == 1; r++){
                        for(c=j; c<n && land[r][c] == 1; c++){
                            land[r][c] = 2;
                        }
                    }
                    arr[2] = r-1;
                    arr[3] = c-1;
                    list.add(arr);
                }
            }
        }
        return result;  //Extra line 

        // return list.toArray(int[][] :: new);     // This is true line for LeetCode  
    }
}
