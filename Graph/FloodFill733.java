package Graph;

public class FloodFill733 {

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] visit = new boolean[image.length][image[0].length];

        helper(image,sr,sc,color,visit,image[sr][sc]);
        return image;

    }

    public static void helper(int[][]image,int sr,int sc,int color,boolean[][]visit,int origColor){
        if(sr>0 || sc>0 || sr<=image.length || sc<=image[0].length || visit[sr][sc]
         || image[sr][sc] != origColor){
            return;
         }

        if(image[sr][sc] == color){
            return;
        }

        //  left
        helper(image,sr,sc-1,color,visit,origColor);
        // right
        helper(image,sr,sc+1,color,visit,origColor);
        // up
        helper(image,sr-1,sc,color,visit,origColor);
        // down
        helper(image,sr+1,sc,color,visit,origColor);
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,1},
                         {1,1,0},
                         {1,0,1}};
        int sr = 1,sc=1,color=2;

        int result[][] = floodFill(image,sr,sc,color);

        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[0].length; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
