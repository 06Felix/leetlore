class Solution {
  public String[] findRestaurant(String[] list1, String[] list2) {
    List<String> ans = new LinkedList<>();
    Map<String, Integer> m = new HashMap<>();
    int minSum = Integer.MAX_VALUE;

    for (int i = 0; i < list1.length; ++i)
      m.put(list1[i], i);

    for (int i = 0; i < list2.length; ++i) {
      String s2 = list2[i];
      if (m.containsKey(s2)) {
        int sum = m.get(s2) + i;
        if (sum < minSum) {
          minSum = sum;
          ans.clear();
          ans.add(s2);
        } else if (sum == minSum) {
          ans.add(s2);
        }
      }
    }

    return ans.toArray(new String[0]);
  }
}
