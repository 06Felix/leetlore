class Solution {
    public String largestNumber(int[] nums) {
      if(nums.length == 0) 
        return String.valueOf(nums[0]);
      int n = nums.length;
      String[] numsArr = new String[nums.length];
      for(int i = 0; i<n; i++)
        numsArr[i] = String.valueOf(nums[i]);
      Arrays.sort(numsArr, (a, b) -> {
        String s1 = a + b;
        String s2 = b + a;
        return s2.compareTo(s1);
      });
      if(numsArr[0].equals("0")) return "0";
      StringBuilder sb = new StringBuilder();
      for(String s: numsArr)
        sb.append(s);
      return sb.toString();
    }
}
