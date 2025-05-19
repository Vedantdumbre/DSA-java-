public class StockBuyAndSell4 {
    public static int stockBuySell(int[] arr, int n) {
       
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            // Update minPrice if current price is lower
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }
            // Calculate profit if current price is higher than minPrice
            else if (arr[i] - minPrice > maxProfit) {
                maxProfit = arr[i] - minPrice;
            }
        }
        return maxProfit; 
        
    }
    public static void main(String[] args) {
        System.out.println(stockBuySell(new int[]{7, 1, 5, 3, 6}, 5)); 
        System.out.println(stockBuySell(new int[]{7,13}, 2)); // Output: 0
    }
}
