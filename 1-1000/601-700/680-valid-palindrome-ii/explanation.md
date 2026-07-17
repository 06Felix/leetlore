# Explanation

## Idea

- Use two pointers from both ends.
- Move inward while characters match.
- On the first mismatch, try skipping either the left character or the right character.

## Why It Works

- A valid palindrome with at most one deletion can have at most one mismatched pair.
- At that mismatch, the deleted character must be one of the two mismatching ends.
- The helper checks whether the remaining substring is already a palindrome.

## Edge Cases

- Already-palindromic strings return `true`.
- Single-character strings return `true`.
- If both skip choices fail, no one-deletion palindrome exists.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
