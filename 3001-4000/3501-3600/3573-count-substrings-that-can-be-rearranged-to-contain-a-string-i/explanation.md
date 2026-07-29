# Count Substrings That Can Be Rearranged to Contain a String I

## Idea

- Count the required frequency of every character in `word2`.
- Use a sliding window over `word1` and maintain the current window frequencies.
- Whenever the window contains all required counts, every extension to the right is also valid, so add `n - right`.
- Shrink from the left while the window remains valid.

## Why It Works

- A substring can be rearranged to have `word2` as a prefix exactly when it contains at least the required count of every character in `word2`.
- Once `[left, right]` is valid, adding more characters on the right cannot remove required characters.
- Shrinking the left boundary finds all minimal valid starts for the current `right` without double-counting.

## Edge Cases

- If `word2` needs a character that the current window lacks, `isValidPrefix` prevents counting.
- Repeated letters in `word2` are handled by frequency comparison.
- If no valid window exists, `count` remains `0`.

## Complexity

- Time: `O(26 * n)`, which is linear with a fixed alphabet.
- Space: `O(1)` for two 26-entry frequency arrays.
