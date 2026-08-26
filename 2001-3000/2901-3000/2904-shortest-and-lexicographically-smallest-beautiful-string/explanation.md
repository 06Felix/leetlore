# Shortest and Lexicographically Smallest Beautiful String

## Idea

- Try every index as the start of the substring.
- Extend the right end until the substring contains exactly `k` ones.
- Once it reaches `k` ones, stop for that start because extending more would only make it longer.
- Keep the best substring seen so far: shorter length first, then lexicographically smaller if lengths tie.

## Why It Works

- A beautiful substring is defined only by having exactly `k` ones.
- For a fixed start index, the first time we reach `k` ones gives the shortest beautiful substring from that start.
- Checking every start index covers every possible beautiful substring candidate.
- The update rule directly matches the requirement: minimum length first, lexicographically smallest among those minimum-length strings.

## Edge Cases

- If the string has fewer than `k` ones, no candidate is found and the answer stays empty.
- If multiple substrings have the same shortest length, `compareTo` picks the lexicographically smallest one.
- `k = 1` works naturally because the loop stops as soon as the first `1` is included.

## Complexity

- Time: `O(n^3)` in the worst case because substring creation and comparison can each cost `O(n)`.
- Space: `O(n)` for the current substring/answer.

## Tags

- String
- Enumeration
- Sliding Window
