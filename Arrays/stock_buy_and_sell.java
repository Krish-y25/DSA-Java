package Arrays;

public class stock_buy_and_sell {

    //Naive Solution SC: O(n)
    static int stbuysell(int[] price, int start, int end){
        if (end<=start) return 0;
        int profit = 0;
        for (int i = start; i<end; i++){
            for(int j = i+1; j<=end; j++){
                if (price[j] > price[i]){
                    int cur_profit = price[j] - price[i] + stbuysell(price, start, i-1)
                            + stbuysell(price, j+1, end);
                    profit = Math.max(profit, cur_profit);
                }
            }
        }
        return profit;
    }

    //Optimal Solution TC: O(n) SC: O(1)
    static int stbuysell_eff(int[] price) {
        int profit = 0;
        for (int i = 1; i<price.length; i++){
            if (price[i] > price[i-1]){
                profit += price[i] - price[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int[] price = {1, 5, 3, 1, 2, 8};
        System.out.println("Max profit: "+ stbuysell_eff(price));
    }
}
