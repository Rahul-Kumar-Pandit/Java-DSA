package java2DArray;



public class SearchInSortedMatrix {
    /* ********** First Rule :- Start Searching from (0,m-1);

    public static boolean StairCaseSearch(int arr[][], int key) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.print("Element is found at (" + row + "," + col + ")");
                return true;
            } else if (key < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key is not found");
        return false;
    }
 */


    // **** Second Rule :- Start Searching from (n-1,0);

    public static boolean StairCaseSearch(int arr[][],int key){
        int col=0,row=arr.length-1;
        while(col<=arr[0].length-1 && row>=0){
            if(arr[row][col]==key){
                System.out.print("Element is found at (" + row + "," + col + ")");
                return true;
            }else if(key<arr[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("Element not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = 
            {   { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 39, 48 },
                { 32, 33, 39, 50 } };
        int key = 50;
        StairCaseSearch(matrix, key);
    }
}
