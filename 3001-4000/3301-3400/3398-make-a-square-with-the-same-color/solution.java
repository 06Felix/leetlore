class Solution {
    private boolean check(char[][] grid){
        for(int i = 1 ; i < 3 ; i++)
            for(int j = 1 ; j < 3 ; j++)
                if(grid[i-1][j-1] == grid[i-1][j] &&  grid[i][j-1] == grid[i][j] && grid[i][j] == grid[i-1][j])
                        return true;
        return false;
    }
    public boolean canMakeSquare(char[][] grid) {
        if(check(grid))
            return true;
        for(int i = 0 ; i < 3 ; i ++){
            for(int j = 0 ; j < 3 ; j++){
                char cr = grid[i][j];
                char ch = cr == 'W' ? 'B' : 'W';
                grid[i][j] = ch;
                if(check(grid))
                    return true;
                grid[i][j] = cr;
            }
        }
        return false;
    }
}
