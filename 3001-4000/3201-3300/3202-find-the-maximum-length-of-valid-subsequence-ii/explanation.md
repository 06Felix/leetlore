## Idea

- Try every target adjacent-sum remainder j. For each value remainder r, update the longest subsequence ending at r from the complementary remainder (j−r+k)%k. Maximize across all target remainders.

## Why It Works

- Fixing j uniquely determines the previous remainder for each new value. dp[r]=dp[complement]+1 appends the current index to a compatible earlier subsequence. Complementary states are nondecreasing as the scan advances, so overwriting this state does not lose a longer solution. When the complement equals r, the old value is read before assignment.

## Edge Cases

- k=1 makes every value compatible. Any two values form a valid length-two subsequence, matching the initial answer of two.

## Complexity

- O(nk+k²) time, including allocating and scanning a k-entry DP array for each target remainder; O(k) auxiliary space.
