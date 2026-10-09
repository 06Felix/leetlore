class ProductOfNumbers {
    List<Integer> prf = new ArrayList<>();
    int cur;
    public ProductOfNumbers() {
        prf.add(1);
        cur = 1;
    }
    
    public void add(int num) {
        if(num == 0){
            prf.clear();
            prf.add(1);
            cur = 1;
            return;
        }
        prf.add(prf.get(cur - 1) * num);
        ++cur;
    }
    
    public int getProduct(int k) {
        if(cur < k + 1 || prf.get(cur - 1) == 0)
            return 0;
        return prf.get(cur - 1) / prf.get(cur - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
