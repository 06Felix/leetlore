# Explanation

## Idea

Check each word against `s` with two pointers. The pointer in `s` always advances; the pointer in the word advances only on matching characters.

When there is no direct match, the current character in `s` must belong to a stretchable group of length at least three.

## Why It Works

A word can become `s` only by adding copies inside groups. So every word character must match in order, and extra characters in `s` are allowed only inside groups that are already length three or more.

The two stretch checks detect whether `s[i]` is part of such a group, either after two same previous chars or with one same previous and one same next char.

If the scan consumes the entire word, it is stretchy.

## Edge Cases

- Short groups in `s` cannot absorb extra characters.
- Words with unmatched trailing characters fail because `j != word.length()`.
- Repeated groups are handled locally by the scan.

## Complexity

Time: `O(|s| * words.length)`.

Space: `O(1)`.
