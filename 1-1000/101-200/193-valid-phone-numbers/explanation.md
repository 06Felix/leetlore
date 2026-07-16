# Explanation

Problem: [Valid Phone Numbers](https://leetcode.com/problems/valid-phone-numbers/)

## Idea

- Use `grep` with two regular expressions, one for each accepted phone format.
- The first pattern matches `xxx-xxx-xxxx`.
- The second pattern matches `(xxx) xxx-xxxx`.
- Both patterns are anchored with `^` and `$` so the entire line must match.

## Why It Works

- `[0-9]\{3\}` and `[0-9]\{4\}` require exactly three or four digits in the needed positions.
- Escaped hyphens and parentheses force the separators to appear exactly as specified.
- `grep -e ... -e ...` prints a line when either valid format matches.
- Full-line anchors reject lines with extra characters, missing digits, or the wrong separators.

## Edge Cases

- Lines with spaces instead of hyphens are rejected.
- Lines with leading or trailing characters are rejected by the anchors.
- Parenthesized numbers require exactly one space after the closing parenthesis.

## Complexity

- Time: $O(L)$ over the total input length scanned by `grep`.
- Space: $O(1)$ beyond the output.
