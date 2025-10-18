package java2DArray;

public class DiagonalSum {
    public static int diagonalSum(int arr[][]){
        int sum = 0;
        // Time Complexity O(n^2)
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(i==j){
        //             sum+=arr[i][j];
        //         }
        //         else if(i+j==arr.length-1){
        //             sum+=arr[i][j];
        //         }
        //     }
        // }


        // Time Complexity
        for(int i=0; i<arr.length; i++){
            // Primary Digonal
            sum +=arr[i][i];
            // Secondary Diagonal
            if(i!=arr.length-i-1){ // Formula i+j=n-1;  j= n-1-i
                sum+=arr[i][arr.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        int sum = diagonalSum(matrix);
        System.out.println(sum);
    }
}
