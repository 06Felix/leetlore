# Count Subarrays With Score Less Than K

## Idea
- Maintain a sliding window's sum, shrinking from the left while sum times length is at least `k`.
- Once valid, add the window length: every shorter suffix ending at the same right index is also valid.

## Why It Works
- Positive values make score increase when extending a window and decrease when removing its leftmost element.
- After shrinking, the current start is the earliest valid one for this endpoint; later starts also qualify, while earlier starts do not.
- Counting at each right endpoint counts every valid nonempty subarray once.

## Edge Cases
- A single value with score at least `k` can shrink the window to empty, contributing zero.
- Equality is excluded. Sum, score multiplication, and answer use `long`; the maximum possible score is at most $10^{15}$.

## Complexity
- Time: $O(n)$ because each element is added and removed at most once.
- Space: $O(1)$ auxiliary storage.
