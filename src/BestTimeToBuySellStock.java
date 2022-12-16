public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int minimumPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minimumPrice) {
                minimumPrice = price;
            }
            if ((price - minimumPrice) > maxProfit) {
                maxProfit = price - minimumPrice;
            }
        }
        return maxProfit;
    }
}
