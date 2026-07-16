class Solution {
    public int accountBalanceAfterPurchase(int num) {
        return 100 - (int)Math.round(num/10.0) * 10;
    }
}
