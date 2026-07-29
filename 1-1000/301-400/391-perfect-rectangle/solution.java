class Solution {
    public boolean isRectangleCover(int[][] rectangles) {
        int area = 0;
        int x2 = Integer.MIN_VALUE;
        int y2 = Integer.MIN_VALUE;
        int x1 = Integer.MAX_VALUE;
        int y1 = Integer.MAX_VALUE;
        Set<String> cPt = new HashSet<>();
        for(int[] rt : rectangles){
            x1 = Math.min(x1, rt[0]);
            y1 = Math.min(y1, rt[1]);
            x2 = Math.max(x2, rt[2]);
            y2 = Math.max(y2, rt[3]);
            area += (rt[2] - rt[0]) * (rt[3] - rt[1]);
            String[] pt = new String[]{rt[0] + " " + rt[1], rt[0] + " " + rt[3], rt[2] + " " + rt[1], rt[2] + " " + rt[3]};
            for(String p : pt)
                if(!cPt.add(p))
                    cPt.remove(p);
        }
        if(cPt.size() != 4 || !cPt.contains(x1 + " " + y1) || !cPt.contains(x1 + " " + y2) || !cPt.contains(x2 + " " + y1) || !cPt.contains(x2 + " " + y2))
            return false;
        return area == (x2 - x1) * (y2 - y1);
    }
}
