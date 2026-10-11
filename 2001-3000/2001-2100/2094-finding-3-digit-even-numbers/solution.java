class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> ans = new ArrayList<>();
        int[] ct = new int[10];
        for (int digit : digits)
            ++ct[digit];
        for (int a = 1; a <= 9; ++a)
            for (int b = 0; b <= 9; ++b)
                for (int c = 0; c <= 8; c += 2)
                    if (ct[a] > 0 && ct[b] > (b == a ? 1 : 0) && ct[c] > (c == a ? 1 : 0) + (c == b ? 1 : 0))
                        ans.add(a * 100 + b * 10 + c);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
