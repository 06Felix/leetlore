# Split the Array

## Idea

- The solution counts how often each number appears.
- If any number appears more than twice, it immediately returns `false`.
- It also tracks the set of distinct values.
- At the end it checks that there are at least `n / 2` distinct values.

## Why It Works

- Each of the two split arrays must contain distinct elements, so any value can appear at most once in each half.
- Therefore an input value appearing more than twice cannot be placed legally.
- Since the original array length is `n` and every value appears at most twice, having at least `n / 2` distinct values is enough to distribute values into two distinct halves.

## Edge Cases

- Four equal values fail as soon as the count reaches `3`.
- Values appearing exactly twice can be placed once in each half.
- Already distinct arrays pass because the distinct count is `n`.

## Complexity

- Time: $O(n)$.
- Space: $O(u)$ for `u` distinct values.
