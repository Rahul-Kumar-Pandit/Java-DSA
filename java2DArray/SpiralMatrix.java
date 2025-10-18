package java2DArray;

public class SpiralMatrix {
    public static void printSpiralMatrix(int arr[][]){
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = arr.length-1;
        int endingCol = arr[0].length-1;

        while(startingRow <=endingRow && startingCol <= endingCol){
            // Top 
            for(int i=startingCol; i<=endingCol; i++){
                System.out.print(arr[startingRow][i]+ " ");
            }
            // Right
            for(int i=startingRow+1; i<=endingCol; i++){
                System.out.print(arr[i][endingCol]+" ");
            }
            // Bottom
            for(int i=endingCol-1; i>=startingCol; i--){
               if(startingRow==endingRow){
                    break;
               }
                System.out.print(arr[endingRow][i]+" ");
            }

            // Left 
            for(int i=endingRow-1; i>=startingRow+1; i--){
                 if(startingCol==endingCol){
                    break;
                }
                System.out.print(arr[i][startingCol]+" ");
            }
            startingRow++;
            startingCol++;
            endingRow--;
            endingCol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,3},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printSpiralMatrix(matrix);
    }
}
