class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        long ans = 0;
        List<Integer>[] arr1 = new List[] {new ArrayList<>(), new ArrayList<>()};
        List<Integer>[] arr2 = new List[] {new ArrayList<>(), new ArrayList<>()};
        for (int num : nums)
            arr1[num % 2].add(num);
        for (int num : target)
            arr2[num % 2].add(num);
        Collections.sort(arr1[0]);
        Collections.sort(arr1[1]);
        Collections.sort(arr2[0]);
        Collections.sort(arr2[1]);
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < arr1[i].size(); j++)
                ans += Math.abs(arr1[i].get(j) - arr2[i].get(j)) / 2;
        return ans / 2;
    }
}
