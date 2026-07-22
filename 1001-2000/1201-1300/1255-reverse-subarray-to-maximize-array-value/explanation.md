# Explanation

Problem: [Reverse Subarray To Maximize Array Value](https://leetcode.com/problems/reverse-subarray-to-maximize-array-value/)

## Idea

- First compute the original adjacent-difference total.
- Track the best gain from reversing a middle subarray using boundary overlap values.
- Separately test reversals that touch the head or tail, because those change only one boundary pair.
- Return original total plus the best gain.

## Why It Works

- Reversing a subarray keeps all internal adjacent absolute differences unchanged; only the boundary edges can change.
- For middle reversals, the best possible gain can be derived from maximizing the gap between smaller endpoints and larger endpoints across adjacent pairs.
- `mx` stores the largest low endpoint and `mn` stores the smallest high endpoint, so `(mx - mn) * 2` captures the best middle-boundary improvement when positive.
- Head and tail reversals have only one outside boundary, so the second loop checks their exact gain for every adjacent pair.

## Edge Cases

- If no reversal improves the value, `diff` stays `0`.
- Length `2` arrays still work because only one adjacent pair exists.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.

## Notes

- The implementation never builds the reversed array; it computes the best possible value directly.
