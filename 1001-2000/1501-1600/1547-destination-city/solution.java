class Solution {
    public String destCity(List<List<String>> paths) {
        ArrayList<String> st = new ArrayList<>();
        ArrayList<String> end = new ArrayList<>();
        for(List<String> path : paths){
            st.add(path.get(0));
            end.add(path.get(1));
        }
        for(String str : end)
            if(!st.contains(str))
                return str;
        return "";
    }
}
