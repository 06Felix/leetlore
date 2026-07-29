class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<>();
        for(int dr = 2 ; dr <= n ; dr++)
            for(int nr = 1 ; nr < dr ; nr++)
                if(gcd(nr, dr) == 1)
                    ans.add(nr + "/" + dr);
        return ans;
    }
    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}
