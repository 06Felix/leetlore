class Solution {
    public String triangleType(int[] nums) {
        int x = nums[0], y = nums[1], z = nums[2];
        if (x + y <= z || x + z <= y || y + z <= x)
            return "none";
        if (x == y && y == z)
            return "equilateral";
        if (x == y || y == z || x == z)
            return "isosceles";
        return "scalene";
    }
}
