class Solution {
    private static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int shortestPathAllKeys(String[] grid) {
        int n = grid.length;
        int m = grid[0].length();
        char[][] mat = new char[n][m];
        int st_i = -1, st_j = -1;
        int k = 0;
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < m ; j++){
                char ch = grid[i].charAt(j);
                if(ch == '@'){
                    st_i = i;
                    st_j = j;
                }
                else if(ch >= 'a' && ch <= 'f')
                    k++;
                mat[i][j] = ch;
            }
        boolean[][][] vis = new boolean[n][m][(1 << k)];
        vis[st_i][st_j][0] = true;
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{st_i, st_j, 0});
        int ans = 0;
        while(!q.isEmpty()){
            ans++;
            for(int sz = q.size() ; sz > 0 ; sz--){
                int[] cur = q.poll();
                int cur_i = cur[0];
                int cur_j = cur[1];
                int cur_k = cur[2];
                for(int[] dir : dirs){
                    int x = cur_i + dir[0];
                    int y = cur_j + dir[1];
                    int new_key = cur_k;
                    if(x < 0 || x == n || y < 0 || y == m || mat[x][y] == '#')
                        continue;
                    char chr = mat[x][y];
                    if(chr >= 'A' && chr <= 'F' && (new_key & (1 << (chr - 'A'))) == 0)
                        continue;
                    if(chr <= 'f' && chr >= 'a'){
                        new_key |= (1 << (chr - 'a'));
                        if(new_key == (1 << k) - 1)
                            return ans;
                    }
                    if(vis[x][y][new_key])
                        continue;
                    vis[x][y][new_key] = true;
                    q.offer(new int[]{x, y, new_key});
                }
            }
        }
        return -1;
    }
}
