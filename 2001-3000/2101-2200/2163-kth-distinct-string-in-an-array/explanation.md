# Explanation

Problem: [Kth Distinct String in an Array](https://leetcode.com/problems/kth-distinct-string-in-an-array/)

## Idea

- Count occurrences of every string with a hash map.
- Scan the original array again in order.
- Decrement `k` only when the current string has frequency `1`.
- Return the string when it is the kth distinct string.

## Why It Works

- The frequency map identifies exactly which strings are distinct.
- The second pass preserves the original order required by the problem.
- Decrementing `k` only for distinct strings counts distinct strings in that order.
- When `k` reaches zero, the current string is exactly the kth distinct string.

## Edge Cases

- If fewer than `k` distinct strings exist, the second pass finishes and returns `""`.
- Duplicate strings are skipped because their frequency is greater than `1`.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$.

## Notes

- The implementation uses `Map.merge` to count strings.
