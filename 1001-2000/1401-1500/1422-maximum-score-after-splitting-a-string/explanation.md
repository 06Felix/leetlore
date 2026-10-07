# Explanation

## Idea
- Count all ones as the initial right-side count.
- Move the split from left to right: each zero increases the left-zero count and each one decreases the right-one count. Track their largest sum.

## Why It Works
- After processing index `i`, the counters describe exactly the zeros in `s[0..i]` and ones in `s[i+1..n-1]`.
- The loop visits every legal split once, so the largest counter sum is the required score.

## Edge Cases
- Stopping before the last character keeps the right side nonempty; processing index zero keeps the left side nonempty.
- All-zero and all-one strings both have maximum score `n - 1`.

## Complexity
- Time: $O(n)$ for the initial count and split scan.
- Space: $O(n)$ for the temporary array from `toCharArray`; counters use $O(1)$ space.
