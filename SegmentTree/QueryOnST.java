package SegmentTree;

public class QueryOnST {
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
        trees[sti] = trees[2*sti+1] + trees[2*sti+2];
        return trees[sti];
    }
    public static int getSum(int[]arr,int qi,int qj){
        int n = arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);
    }
    public static int getSumUtil(int i,int si,int sj,int qi,int qj){
        if(qj<=si || qi>=sj){
            return 0;
        }else if(si>=qi && sj<=qj){
            return trees[i];
        }else{
            int mid = si + (sj-si)/2;
            int left = getSumUtil(2*i+1, si, mid, qi, qj);
            int right = getSumUtil(2*i+2, mid+1, sj, qi, qj);
            return left + right;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        initialize(n);
        buildST(arr, 0, 0, n-1);

        System.out.println(getSum(arr, 2, 5));
    }
}
