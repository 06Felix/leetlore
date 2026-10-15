class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int n = code.length;
        List<String> ans = new ArrayList<>();
        List<String> elec = new ArrayList<>();
        List<String> groc = new ArrayList<>();
        List<String> phar = new ArrayList<>();
        List<String> rest = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String cur = code[i];
            if (cur.isEmpty())
                continue;
            if (!stringCheck(cur))
                continue;
            if (businessLine[i].equals("electronics") && isActive[i])
                elec.add(cur);
            else if (businessLine[i].equals("grocery") && isActive[i])
                groc.add(cur);
            else if (businessLine[i].equals("pharmacy") && isActive[i])
                phar.add(cur);
            else if (businessLine[i].equals("restaurant") && isActive[i])
                rest.add(cur);
        }
        Collections.sort(elec);
        Collections.sort(groc);
        Collections.sort(phar);
        Collections.sort(rest);
        ans.addAll(elec);
        ans.addAll(groc);
        ans.addAll(phar);
        ans.addAll(rest);
        return ans;
    }

    public boolean stringCheck(String cur) {
        for (char c : cur.toCharArray())
            if (!(Character.isLetterOrDigit(c) || c == '_'))
                return false;
        return true;
    }
}
