class LUPrefix {
    boolean[] seen;
    int longPrefix = 0;
    int n;
    public LUPrefix(int n) {
        seen = new boolean[n + 1];
        this.n = n;
    }
    
    public void upload(int video) {
        seen[video] = true;
        while(longPrefix + 1 <= n && seen[longPrefix + 1])
            longPrefix++;
    }
    
    public int longest() {
        return longPrefix;
    }
}

/**
 * Your LUPrefix object will be instantiated and called as such:
 * LUPrefix obj = new LUPrefix(n);
 * obj.upload(video);
 * int param_2 = obj.longest();
 */
