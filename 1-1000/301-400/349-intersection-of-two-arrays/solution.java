class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set = new HashSet<>();
    List<Integer> ans = new ArrayList<>();

    // Add all elements of nums1 to the set
    for (int num : nums1)
      set.add(num);

    // Check each element of nums2 if it exists in the set
    // If yes, add it to the answer list and remove it from the set
    for (int num : nums2) {
      if (set.contains(num)) {
        ans.add(num);
        set.remove(num); // Ensures uniqueness
      }
    }

    // Convert list to array
    int[] result = new int[ans.size()];
    for (int i = 0; i < ans.size(); i++)
      result[i] = ans.get(i);

    return result;
  }
}
