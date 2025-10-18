package JavaArray;

public class BuyAndSell {
    public static int buyAndsellPrice(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<price.length; i++){
            if(buyPrice<price[i]){  // for profix
                // Profit formula
                int profix = price[i] - buyPrice;  //Today's profit
                maxProfit = Math.max(maxProfit,profix);
            }else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit is : "+buyAndsellPrice(price));
    }
}
