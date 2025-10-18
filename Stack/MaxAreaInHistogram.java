package Stack;
import java.util.Stack;
public class MaxAreaInHistogram {
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nextSmallerR[] = new int[arr.length];
        int nextSmallerL[] = new int[arr.length];

        // Create a Stack of Integer
        Stack<Integer> s = new Stack<>();
        // Next Smaller Right 
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerR[i] = arr.length;
            }else{
                nextSmallerR[i] = s.peek();
            }

            s.push(i);
        }

        // Next Smaller Left
        s = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerL[i] = -1;
            }else{
                nextSmallerL[i] =  s.peek();
            }
            s.push(i);
        }

        // Current Area (j-i-1)     // nsr[i] - nsl[i] - 1
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nextSmallerR[i]-nextSmallerL[i]-1; //(j-i-1)
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("\nMaximum Area in my Histogram = "+maxArea+"\n\n");
    }

    public static void main(String[] args) {
        int height[] = {2,5,4,6,4};   // Height of Histogram 
        maxArea(height);
    }
}
