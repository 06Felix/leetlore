# Explanation

## Idea

- `dp[i]` stores the best ideal subsequence length ending with character `'a' + i`.
- For each character, look at all ending characters within distance `k`.
- Set the current character's slot to one plus the best reachable length.

## Why It Works

- A character can follow only previous characters whose alphabet distance is at most `k`.
- The helper scans exactly that allowed character range.
- Updating the current ending bucket preserves the best subsequence ending at that character.

## Edge Cases

- `k = 0` allows only equal adjacent letters.
- `k = 25` allows any lowercase previous letter.
- Repeated characters naturally extend the same bucket.

## Complexity

- Time: $O(26n)$.
- Space: $O(26)$.
