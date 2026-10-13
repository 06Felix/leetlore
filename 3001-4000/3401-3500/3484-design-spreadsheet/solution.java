class Spreadsheet {
    private int[][] sheet;
    private int[] getId(String st) {
        return new int[] {Integer.valueOf(st.substring(1)) - 1, st.charAt(0) - 'A'};
    }
    public Spreadsheet(int rows) {
        sheet = new int[rows][26];
    }
    
    public void setCell(String cell, int value) {
        int[] id = getId(cell);
        sheet[id[0]][id[1]] = value;
    }
    
    public void resetCell(String cell) {
        int[] id = getId(cell);
        sheet[id[0]][id[1]] = 0;
        
    }
    
    public int getValue(String formula) {
        int div = formula.indexOf('+');
        int ans = 0;
        if(Character.isAlphabetic(formula.charAt(1))) {
            int[] id = getId(formula.substring(1, div));
            ans += sheet[id[0]][id[1]];
        }
        else 
            ans += Integer.valueOf(formula.substring(1, div));
        if(Character.isAlphabetic(formula.charAt(div + 1))) {
            int[] id = getId(formula.substring(div + 1));
            ans += sheet[id[0]][id[1]];
        }
        else 
            ans += Integer.valueOf(formula.substring(div + 1));
        return ans;        
    }
}
