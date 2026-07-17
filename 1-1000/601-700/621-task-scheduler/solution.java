class Solution {
  public int leastInterval(char[] tasks, int n) {
    int[] count = new int[26];
    for (char task : tasks)
      count[task - 'A']++;
    int mF = 0;
    for(int ct : count)
        mF = Math.max(mF,ct);
    int maxFreqTaskOccupy = (mF - 1) * (n + 1);
    int mFc = 0;
    for(int ct : count)
        if(ct == mF)
            mFc++;
    return Math.max(maxFreqTaskOccupy + mFc, tasks.length);
  }
}
