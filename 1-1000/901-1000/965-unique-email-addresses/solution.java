class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> st = new HashSet<>();
        for(String em : emails){
            String[] pt = em.split("@");
            String[] ig = pt[0].split("\\+");
            st.add(ig[0].replace(".", "") + "@" + pt[1]);
        }
        return st.size();
    }
}
