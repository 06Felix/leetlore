class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr)
            map.put(i, map.getOrDefault(i, 0) + 1);

        List<Integer> list = new ArrayList<>(map.values());

        Collections.sort(list);
        int si = list.size();

        for (int val : list) {
            if (val > k)
                return si;
            k -= val;
            si--;
        }
        return si;
    }
}
