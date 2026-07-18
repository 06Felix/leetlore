class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0 ; i < groupSizes.length ; i++)
            arr.add(new ArrayList<>());
        for (int i = 0; i < groupSizes.length; i++) {
            arr.get(groupSizes[i] - 1).add(i);
            if (arr.get(groupSizes[i] - 1).size() == groupSizes[i]) {
                ans.add(arr.get(groupSizes[i] - 1));
                arr.set(groupSizes[i] - 1, new ArrayList<Integer>());
            }
        }
        return ans;
    }
}
