# Maximum Number of Non-Overlapping Substrings

## Idea

- First store the first and last position of every character.
- For each character, try to build the smallest valid substring that starts at its first occurrence.
- While expanding that substring, every character inside it must have all of its occurrences inside the same range.
- After collecting valid ranges, sort them by ending index and greedily pick non-overlapping ones.

## Why It Works

- A valid substring containing character `c` must cover from `first[c]` to `last[c]`.
- If a range includes another character whose first occurrence is before the range, that range can never be valid.
- Otherwise, extending the right end to include each character's last occurrence gives the smallest valid range for that start.
- Choosing ranges by earliest end leaves the most room for future ranges, which maximizes the count and keeps the total length minimal.

## Edge Cases

- A single character can form a valid substring by itself.
- Nested or overlapping candidate ranges are handled by the earliest-ending greedy choice.
- Repeated characters are safe because every picked substring includes all occurrences of each character inside it.

## Complexity

- Time: `O(n + 26 log 26)`
- Space: `O(1)` apart from the returned substrings

## Tags

- Greedy
- String
- Intervals
