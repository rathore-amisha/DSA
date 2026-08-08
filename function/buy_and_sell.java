public class buy_and_sell {
    public static int buyAndSellStocks(int prices[]){
        int buy_price = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i =0;i<prices.length;i++){
            if(buy_price < prices[i]){
                int profit = prices[i] - buy_price;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buy_price = prices[i];
            }

        }
        return maxprofit;
    }
    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};
        int stock = buyAndSellStocks(price);
        System.out.println("maximum profit for a stock :"+stock);
    }
}
