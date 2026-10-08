class Solution {
    public int poorPigs(int buckets, int mD, int mT) {
        int test = mT / mD + 1;
        int ans = 0;
        for(int i = 1 ; i < buckets ; i *= test, ans++);
        return ans;
    }
}
