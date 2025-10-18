package Sorting;

public class QuickSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pIdx =  partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);  // left part
        quickSort(arr, pIdx+1, ei);  // right part
    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1; // to make space for smaller ele than pivot
        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // fixing for pivot element in appropriate position 
        // Swap 
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        // Return pivot index
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
