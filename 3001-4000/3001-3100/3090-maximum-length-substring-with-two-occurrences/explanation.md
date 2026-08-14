# Maximum Length Substring With Two Occurrences

## Idea

Use a sliding window.

The window should always satisfy:

```text
every character appears at most twice
```

We expand the right side one character at a time. If the newly added character appears more than twice, move the left side forward until that character is valid again.

## Approach

The code keeps:

- `freq`: count of each character inside the current window
- `l`: left boundary of the window
- `ans`: best valid window length seen so far

For every right boundary `r`:

1. Add `s[r]` to the window.
2. If its count becomes `3`, shrink from the left.
3. Update the answer with the current window length.

Only the newly added character can break the rule, so the `while` loop only needs to check that character's frequency.

## Why It Works

The window is always valid after the shrinking step.

For each `r`, the algorithm keeps the left boundary as far left as possible while still satisfying the condition. That gives the longest valid substring ending at `r`.

Taking the maximum over all `r` gives the overall answer.

## Edge Cases

- If every character already appears at most twice, the whole string is valid.
- If one character repeats many times, the left boundary moves enough to keep only two copies.
- A single-character string returns `1`.

## Complexity

- Time: `O(n)`
- Space: `O(26)`

## Tags

- Sliding Window
- String
- Counting
