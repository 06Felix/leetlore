class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int l = 1, r = skill.length - 2;
        int req = skill[0] + skill[r + 1];
        long ans = skill[0] * skill[r + 1];
        while(l < r){
            if(skill[l] + skill[r] != req)
                return -1;
            ans += skill[l++] * skill[r--];
        }
        return ans;
    }
}
