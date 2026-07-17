# Explanation

## Idea

- Alice can eat only `n / 2` candies.
- Add candy types to a set until either all candies are scanned or the set reaches size `n / 2`.
- Return the number of distinct types collected.

## Why It Works

- The answer cannot exceed the number of candies Alice may eat.
- It also cannot exceed the number of distinct candy types available.
- The set grows only with new types, so stopping at `n / 2` already reaches the maximum possible answer.

## Edge Cases

- If all candies have the same type, the set size remains `1`.
- If many unique types exist, the early stop returns `n / 2`.
- Duplicate values do not increase the set size.

## Complexity

- Time: $O(n)$ worst case.
- Space: $O(\min(n, n/2))$ for the set.
