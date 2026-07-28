# Explanation

## Idea

Split the sentence into words, copy the first `k` words into a new array, then join them with spaces.

## Why It Works

The input guarantees single spaces, no leading spaces, and no trailing spaces, so `split(" ")` produces exactly the word list.

Taking indices `0` through `k - 1` keeps the first `k` words, and `String.join` restores the same sentence format.

## Edge Cases

- `k = 1` returns the first word.
- If `k` equals the number of words, the original sentence content is reconstructed.

## Complexity

Time: `O(|s|)`.

Space: `O(|s|)`.
