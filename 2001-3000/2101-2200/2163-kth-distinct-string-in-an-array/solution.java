class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> m = new HashMap<>();
        for(String st : arr)
            m.merge(st, 1, Integer::sum);
        for(String st : arr){
            if(m.get(st) == 1)
                k--;
            if(k == 0)
                return st;
        }
        return "";
    }
}
