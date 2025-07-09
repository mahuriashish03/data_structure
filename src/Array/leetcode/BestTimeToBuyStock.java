package Array.leetcode;

public class BestTimeToBuyStock {


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 5};
        maxProfit(prices);
        maxProfitON(prices);
    }
    private static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for(int i = 0; i <= prices.length-1; i++) {
           int buy = prices[i];
            for(int j = i+1; j<prices.length; j++) {
               int  sell = prices[j];
               int  difference = sell-buy;
                if(difference > maxProfit) {
                    maxProfit = difference;
                }
            }
        }
        System.out.println(maxProfit);
        return maxProfit;
    }

    private static int maxProfitON(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices) {
            if( price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        System.out.println(maxProfit);
        return maxProfit;
    }
}

