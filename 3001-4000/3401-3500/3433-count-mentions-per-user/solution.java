class Solution {
    public int[] countMentions(int n, List<List<String>> events) {
        int[] ans = new int[n];
        int[] off = new int[n];
        Arrays.fill(off, -61);
        Collections.sort(events, (e1, e2) -> e1.get(1).equals(e2.get(1)) ? e2.get(0).compareTo(e1.get(0)) : 
                                            Integer.parseInt(e1.get(1)) - Integer.parseInt(e2.get(1)));
        for(List<String> ev : events){
            String type = ev.get(0);
            int ts = Integer.parseInt(ev.get(1));
            String ids = ev.get(2);
            if(type.equals("OFFLINE"))
                off[Integer.parseInt(ids)] = ts;
            else{
                if(ids.equals("ALL")){
                    for(int i = 0 ; i < n ; i++)
                        ans[i]++;
                }
                else if(ids.equals("HERE")){
                    for(int i = 0 ; i < n ; i++)
                        if(ts >= off[i] + 60)
                            ans[i]++;
                }
                else{
                    String[] arr = ids.split("[ ]*id");
                    for(int i = arr.length - 1 ; i > 0 ; i--)
                        ans[Integer.parseInt(arr[i])]++;
                }
            }
        }
        return ans;
    }
}
