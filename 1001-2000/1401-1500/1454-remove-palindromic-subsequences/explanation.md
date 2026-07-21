# Remove Palindromic Subsequences

## Idea

- Check whether the whole string is already a palindrome.
- If yes, remove it in one step.
- Otherwise, return `2`.

## Why It Works

- The string contains only `a` and `b`.
- If it is a palindrome, the entire string is one palindromic subsequence.
- If it is not, all `a` characters form a palindromic subsequence and all `b` characters form another.
- Therefore any non-palindrome can be removed in exactly two steps.

## Edge Cases

- Length `1` is always a palindrome.
- Strings with only one repeated character return `1`.
- Mixed non-palindromic strings return `2`.

## Complexity

- Time: $O(n)$ from reversing and comparing.
- Space: $O(n)$ for the reversed string.
