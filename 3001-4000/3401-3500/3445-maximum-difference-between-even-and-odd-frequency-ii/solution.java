class Solution {
    public int maxDifference(String s, int k) {
        int ans = Integer.MIN_VALUE;
        for (Pair<Character, Character> pair : getPermutations()) {
            char a = pair.getKey();
            char b = pair.getValue();
            int[][] df = new int[2][2];
            Arrays.stream(df).forEach(A -> Arrays.fill(A, Integer.MAX_VALUE / 2));
            List<Integer> pA = new ArrayList<>(List.of(0));
            List<Integer> pB = new ArrayList<>(List.of(0));
            for (int l = 0, r = 0; r < s.length(); ++r) {
                pA.add(pA.get(pA.size() - 1) + (s.charAt(r) == a ? 1 : 0));
                pB.add(pB.get(pB.size() - 1) + (s.charAt(r) == b ? 1 : 0));
                while (r - l + 1 >= k &&                                   
                    pA.get(l) < pA.get(pA.size() - 1) &&
                    pB.get(l) < pB.get(pB.size() - 1)) {
                        df[pA.get(l) % 2][pB.get(l) % 2] = Math.min(
                            df[pA.get(l) % 2][pB.get(l) % 2], pA.get(l) - pB.get(l));
                        ++l;
                }
                ans = Math.max(ans, (pA.get(pA.size() - 1) - pB.get(pB.size() - 1)) -
                                        df[1 - pA.get(pA.size() - 1) % 2]
                                            [pB.get(pB.size() - 1) % 2]);
            }
        }
        return ans;
    }
    private List<Pair<Character, Character>> getPermutations() {
        List<Pair<Character, Character>> permutations = new ArrayList<>();
        for (char a : "01234".toCharArray())
            for (char b : "01234".toCharArray())
                if (a != b)
                    permutations.add(new Pair<>(a, b));
        return permutations;
    }
}
