class Solution {
    public String[] shortestSubstrings(String[] arr) {
        Set<String>[] s = new HashSet[arr.length];

        for (int i = 0; i < arr.length; i++) {
            s[i] = new HashSet<>();
            String a = arr[i];
            for (int j = 0; j < a.length(); j++) {
                for (int k = j + 1; k <= a.length(); k++) {
                    s[i].add(a.substring(j, k));
                }
            }
        }

        String[] ans = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            Set<String> u = new HashSet<>();
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    u.addAll(s[j]);
                }
            }
            ans[i] = findShortestUniqueSubstring(arr[i], u);
        }

        return ans;
    }

    private String findShortestUniqueSubstring(String s, Set<String> substrings) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String t = s.substring(i, j);
                if (!substrings.contains(t)) {
                    if (r.isEmpty() || t.length() < r.length() ||
                            (t.length() == r.length() && t.compareTo(r) < 0)) {
                        r = t;
                    }
                }
            }
        }
        return r;
    }
}
