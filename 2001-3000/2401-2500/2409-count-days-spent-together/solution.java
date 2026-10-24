class Solution {
    private static final int[] DAYS = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {
        int start = Math.max(day(arriveAlice), day(arriveBob));
        int end = Math.min(day(leaveAlice), day(leaveBob));

        return Math.max(0, end - start + 1);
    }

    private int day(String str) {
        int month = (str.charAt(0) - '0') * 10 + str.charAt(1) - '0';
        int date = (str.charAt(3) - '0') * 10 + str.charAt(4) - '0';
        int ans = date;

        for (int i = 0; i < month - 1; ++i)
            ans += DAYS[i];

        return ans;
    }
}
