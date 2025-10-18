package SegmentTree;

public class MinMax {
    static int[]trees;
    public static void initialize(int n){
        trees = new int[4*n];    
    }
    public static int buildST(int[]arr,int sti,int start,int end){
        // Here (sti --> segment Tree Index)
        
        // Base Case 
        if(start == end){
            trees[sti] = arr[start];
            return arr[start];
        }

        int mid = start + (end-start)/2;
        buildST(arr, 2*sti+1, start, mid);  // left SubTree index = 2*i+1;
        buildST(arr, 2*sti+2, mid+1, end);  // right SubTree index = 2*i+2;
        trees[sti] = Math.max(trees[2*sti+1],trees[2*sti+2]);
        return trees[sti];
    }
    public static void main(String[] args) {
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;
        initialize(n);
        buildST(arr, 0, 0, n-1);
        for(int i=0; i<trees.length; i++){
            System.out.print(trees[i]+" ");
        }
        System.out.println();
    }
}
