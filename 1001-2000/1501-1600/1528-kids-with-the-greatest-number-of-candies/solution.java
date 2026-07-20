class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<>();
        int mx = 0;
        for(int i=0;i<candies.length;i++)
            mx = Math.max(mx,candies[i]);
        for(int i=0;i<candies.length;i++)
            l.add(candies[i]+extraCandies >= mx ? true : false);
        return l;
    }
}
