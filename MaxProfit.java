// If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
// design an algorithm to find the maximum profit.
// Naive approach is O(n^2) find range at every element
// Better solution is O(n)
// [6, 3, 9, 10, 26, 4, 1] => 23
public int maxProfitStock(int[] stocks) {
    int minElement = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int i = 0; i < stocks.length; i++) {
        maxProfit = Math.max(maxProfit, arr[i] - minElement);
        minElement = Math.min(minElement, stock[i]);
    }
    return maxProfit;
}
