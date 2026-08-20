package searching.array.buyandsalestock;

public class BuyAndSaleSecond {

    // Brute Force
    public long buyAndSale(int index, int buy, long [] prices){

        // Base case
        if(index == prices.length){
            return 0;
        }
        // main code
        // Buy
        if(buy == 1){
            // Buy
            long buyStock = -prices[index] + buyAndSale(index + 1, 0, prices);
            // skip
            long skip = buyAndSale(index + 1, 1, prices);
            return Math.max(buyStock, skip);
        }
        // Sale
        else{
            long saleStock = prices[index] + buyAndSale(index + 1, 1, prices);
            long skip = buyAndSale(index + 1,0, prices);
            return Math.max(saleStock, skip);
        }
    }
}
