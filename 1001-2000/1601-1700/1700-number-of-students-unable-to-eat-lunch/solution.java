class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] ct = new int[2];
        for (int stu : students)
            ct[stu]++;
        for (int i = 0; i < sandwiches.length; i++) {
            if (ct[sandwiches[i]] == 0)
                return sandwiches.length - i;
            ct[sandwiches[i]]--;
        }
        return 0;
    }
}
