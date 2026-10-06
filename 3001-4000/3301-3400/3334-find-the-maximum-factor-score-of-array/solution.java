class Solution {
    public long maxScore(int[] nums) {
        int n = nums.length;
        long overallGCD = findGCD(nums);
        long overallLCM = findLCM(nums);
        long maxScore = overallGCD * overallLCM;

        for (int i = 0; i < n; i++) {
            int[] rem = new int[n - 1];
            for (int j = 0, k = 0; j < n; j++) {
                if (j != i) {
                    rem[k++] = nums[j];
                }
            }
            long curGCD = findGCD(rem);
            long curLCM = findLCM(rem);
            long curScore = curGCD * curLCM;
            maxScore = Math.max(maxScore, curScore);
        }
        
        return maxScore;
    }
    
    private long findGCD(int[] nums) {

        if(nums.length < 1)
            return 1;
        long res = nums[0];
        for (int num : nums) {
            res = gcd(res, num);
        }
        return res;
    }

    private long findLCM(int[] nums) {
        if(nums.length < 1)
            return 1;
        long res = nums[0];
        for (int num : nums) {
            res = lcm(res, num);
        }
        return res;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}
