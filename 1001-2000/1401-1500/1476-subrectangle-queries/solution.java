class SubrectangleQueries {
    private int[][] rectangle;
    private List<int[]> updates = new ArrayList<>();

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        updates.add(new int[] { row1, col1, row2, col2, newValue });
    }

    public int getValue(int row, int col) {
        for (int i = updates.size() - 1; i >= 0; --i) {
            int[] update = updates.get(i);
            int r1 = update[0];
            int c1 = update[1];
            int r2 = update[2];
            int c2 = update[3];
            int v = update[4];
            if (r1 <= row && row <= r2 && c1 <= col && col <= c2)
                return v;
        }
        return rectangle[row][col];
    }
}
