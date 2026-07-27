class Solution {
    public String[] reorderLogFiles(String[] logs) {
        int n = logs.length;
        String[] ans = new String[n];
        List<String[]> ll = new ArrayList<>();
        List<String> dl = new ArrayList<>();
        for(String lg : logs){
            int i = lg.indexOf(' ');
            if(Character.isDigit(lg.charAt(i + 1)))
                dl.add(lg);
            else
                ll.add(new String[]{lg.substring(0, i), lg.substring(i + 1)});
        }
        Collections.sort(ll, (a, b) -> {
            if(a[1].equals(b[1]))
                return a[0].compareTo(b[0]);
            return a[1].compareTo(b[1]);
        });
        int id = 0;
        for(String[] x : ll)
            ans[id++] = String.join(" ", x);
        for(String x : dl)
            ans[id++] = x;
        return ans;
    }
}
