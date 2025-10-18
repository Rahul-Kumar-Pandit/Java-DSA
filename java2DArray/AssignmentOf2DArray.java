package java2DArray;

public class AssignmentOf2DArray {

    // Question 1.
    // Print the number of 7’s that are in the 2d array.
    public static int CountNumber(int arr[][]){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }

    // Question 2. 
    // Print out the sum of the numbers in the second row of the “nums” array.
    public static int SumOfRow(int arr[][]){
        int sum = 0;
        int oneArry[] = arr[1];
        for(int i=0; i<oneArry.length; i++){
            sum = sum + oneArry[i];
        }
        return sum;
    }

    // Question 3.
    // Print Transpose of the given matrix
    public static void getTranspose(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int ans[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = arr[j][i];
            }
        }
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int arr[][] = {{4,7,8},{8,8,7}};
        // int count = CountNumber(arr);
        // System.out.println("How many time 7 in this array is : "+count);

        // System.out.println(SumOfRow(arr));

        int matrix[][] = {{1,2,3},{4,5,6}};
        getTranspose(matrix);
       
    }
}
