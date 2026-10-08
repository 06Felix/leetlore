class Solution {
    private int[][] mat;
    private boolean[][] seen;
    private int n, m;
    private int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    class Region{
        int walls = 0;
        private Set<Integer> nextPoints;
        private Set<Integer> curPoints;
        Region(int i, int j){
            this.walls = 0;
            this.nextPoints = new HashSet<>();
            this.curPoints = new HashSet<>();
            this.dfs(i, j);
        }
        void dfs(int i, int j){
            if(i < 0 || i == n || j < 0 || j == m || mat[i][j] == 2 || seen[i][j])
                return;
            if(mat[i][j] == 0){
                ++walls;
                nextPoints.add(i * m + j);
                return;
            }
            seen[i][j] = true;
            curPoints.add(i * m + j);
            for(int[] d: dirs)
                dfs(i + d[0], j + d[1]);
        }
        void spread(){
            for(int pt : nextPoints){
                int i = pt / m;
                int j = pt % m;
                curPoints.add(i * m + j);
                mat[i][j] = 1;
            }
        }
        void disinfect(){
            for(int pt : curPoints){
                int i = pt / m;
                int j = pt % m;
                mat[i][j] = 2;
            }
        }
    }
    public int containVirus(int[][] isInfected) {
        this.mat = isInfected;
        this.n = isInfected.length;
        this.m = isInfected[0].length;
        int ans = 0;
        Queue<Region> q = new PriorityQueue<>((r1, r2) -> r2.nextPoints.size() - r1.nextPoints.size());
        while(true){
            seen = new boolean[n][m];
            for(int i = 0 ; i < n ; i++)
                for(int j = 0 ; j < m ; j++)
                    if(mat[i][j] == 1 && !seen[i][j])
                        q.offer(new Region(i, j));
            if(q.isEmpty())
                break;
            Region reg = q.poll();
            ans += reg.walls;
            reg.disinfect();
            while(!q.isEmpty())
                q.poll().spread();
        }
        return ans;
    }
}
