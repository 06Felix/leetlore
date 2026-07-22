class Solution {
    public String losingPlayer(int x, int y) {
        String ans = "Bob";
        while(x > 0 && y > 3){
            x -= 1;
            y -= 4;
            ans = ans.equals("Bob") ? "Alice" : "Bob";
        }
        return ans;
    }
}
