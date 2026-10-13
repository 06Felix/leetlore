class Solution {
    public int compareVersion(String version1, String version2) {
        String[] levels1 = version1.split("\\.");
        String[] levels2 = version2.split("\\.");
        int n = levels1.length;
        int m = levels2.length;
        int length = Math.max(levels1.length, levels2.length);
        for (int i = 0; i < length; ++i) {
            Integer v1 = i < n ? Integer.parseInt(levels1[i]) : 0;
            Integer v2 = i < m ? Integer.parseInt(levels2[i]) : 0;
            int compare = v1.compareTo(v2);
            if (compare != 0)
                return compare;
        }
        return 0;
    }
}
