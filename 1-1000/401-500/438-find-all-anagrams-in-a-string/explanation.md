# Explanation

Problem: [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)

## Idea

- Store needed character counts from `p` in an array.
- Expand a right pointer through `s`, decreasing the count for each character.
- Track `rq`, the number of required characters still missing.
- When all required characters are present, shrink from the left and record windows whose length equals `p.length()`.

## Why It Works

- The count array records how many more of each character the current window needs, with negative values representing extras.
- `rq == 0` means the window contains at least all characters required by `p`.
- A window with all required characters and length exactly `p.length()` cannot contain extras, so it is an anagram.
- Shrinking restores counts for removed characters and advances to the next candidate window without skipping any start index.

## Edge Cases

- If `p` is longer than `s`, no length-matching window is added.
- Repeated letters in `p` are handled by the frequency counts.

## Complexity

- Time: $O(|s| + |p|)$.
- Space: $O(1)$ because the count array has fixed size `128`.

## Notes

- The problem only needs lowercase letters, but the implementation uses an ASCII-sized count array.
