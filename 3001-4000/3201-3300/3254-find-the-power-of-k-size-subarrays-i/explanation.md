# Explanation

## Idea
- Slide a window of length at most `k`, tracking one plus the number of adjacent pairs whose right value is exactly the left value plus one.
- Add the incoming pair's contribution and remove the outgoing pair's contribution when the window advances.
- A full window has power equal to its final value exactly when the counter equals `k`; otherwise return `-1` for it.

## Why It Works
- A length-`k` window has `k - 1` adjacent pairs and is consecutive increasing exactly when every pair satisfies the increment rule.
- The counter equals one plus the count of satisfying pairs, so it reaches `k` precisely for valid windows.
- For such a window, its final value is also its maximum and therefore its power.

## Edge Cases
- `k = 1` yields each original value because every one-element window is valid.
- Equal, decreasing, or gapped neighboring values do not contribute; a counter of good pairs remains correct even across several separate runs.

## Complexity
- Time: $O(n)$.
- Auxiliary space: $O(1)$ excluding the returned $O(n-k+1)$ array.
