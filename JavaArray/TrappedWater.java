// The Question For Trapping rainWater 
// Important Question for interview (See Copy and underStand the logic )
package JavaArray;

public class TrappedWater {
    public static int TrappedRainWater(int barHeight[]){
        // Calculate left boundary - array
        int leftMax[] = new int[barHeight.length];
        leftMax[0] = barHeight[0];
        for(int i=1; i<barHeight.length; i++){
            leftMax[i] = Math.max(barHeight[i],leftMax[i-1]);
        }

        // Calculate right boundary - array
        int rightMax[] = new int[barHeight.length];
        rightMax[barHeight.length-1] = barHeight[barHeight.length-1];
        for(int i=barHeight.length-2; i>=0; i-- ){
            rightMax[i] = Math.max(barHeight[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        // loop
        for(int i=0; i<barHeight.length; i++){
            // Waterlevel = min(left boundary,right bounday)
            int WaterLevel = Math.min(leftMax[i],rightMax[i]);
            // TrappedWater = (Waterlevel - barheight)*Width (In this Q.Width = 1)
            trappedWater += (WaterLevel-barHeight[i]);
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int a[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped Water is = "+TrappedRainWater(a));
    }
}




