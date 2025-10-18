package LeetCode;
public class RotateArray {
    // public static void rotateArray(int []arr,int k){
    //     ArrayList<Integer> res = new ArrayList<>();
    //     for(int i=arr.length-k; i<arr.length; i++){
    //         res.add(arr[i]);
    //     }
    //     for(int i=0; i<arr.length-k; i++){
    //         res.add(arr[i]);
    //     }
    //     for(int i=0; i<res.size(); i++){
    //         System.out.print(res.get(i)+" ");
    //     }
    // }
    
    public static void reverseArray(int arr[],int si,int ei){
        while(si<ei){
            swap(arr,si,ei);
            si++;
            ei--;
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4};
        int k=4;
        int n=arr.length;
        k = k%n;
        reverseArray(arr,0,n-k-1);
        // rotateArray(arr, k);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
        printArray(arr);
    }
}
