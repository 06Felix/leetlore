class Solution {
    public long maxWeight(int[] pizzas) {
        int n = pizzas.length / 4;
        long ans = 0;
        Arrays.sort(pizzas);
        int id = n * 4 - 1;
        for(int i = (n + 1) / 2 ; i > 0 ; i--)
            ans += pizzas[id--];
        for(int i = n / 2 ; i > 0 ; i--){
            id--;
            ans += pizzas[id--];
        }
        return ans;
    }
}
