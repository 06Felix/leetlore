class Solution {
    public int pivotInteger(int n) {
        int totalSum = (n * (n + 1)) / 2;
        int root = (int) Math.sqrt(totalSum);
        return root * root == totalSum ? root : -1;
    }
}
