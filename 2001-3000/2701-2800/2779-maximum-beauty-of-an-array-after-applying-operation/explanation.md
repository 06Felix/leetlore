# Explanation

## Idea
- Sort the array and maintain a window whose largest and smallest values differ by at most `2 * k`.
- Extend `right` while the window fits; record its size, then advance `left` until the next value can join.

## Why It Works
- Values can all become equal exactly when their allowed intervals overlap: $\max(nums)-\min(nums) \le 2k$.
- In sorted order, every value between feasible endpoints also fits. Both pointers advance monotonically, covering the largest feasible window.

## Edge Cases
- With `k == 0`, only equal original values can share a target.
- One element always gives beauty one; if the whole array fits, the loop stops after recording its full size.

## Complexity
- Time: $O(n \log n)$ for sorting, followed by an $O(n)$ scan.
- Auxiliary space: $O(\log n)$ for Java's primitive-array sort; the window uses constant space.

## Notes
- The implementation sorts `nums` in place. Original ordering does not affect how many equal elements can form a subsequence.
