# Explanation

Problem: [Append Characters to String to Make Subsequence](https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/)

## Idea

Scan `s` with one pointer and greedily match the next needed character of `t` with another pointer. The unmatched suffix length of `t` is the number of characters to append.

## Why It Works

To maximize how much of `t` is already a subsequence of `s`, each character of `t` should be matched as early as possible in `s`. The two-pointer scan does exactly that: whenever `s[i]` equals `t[j]`, it advances `j` to the next needed character. After scanning all of `s`, the first `j` characters of `t` are matched, and the remaining `t.length() - j` characters must be appended in order to make all of `t` a subsequence.

## Edge Cases

- If all of `t` is already matched, the answer is `0`.
- If no characters match, the answer is `t.length()`.

## Complexity

- Time: `O(|s| + |t|)` for the scan.
- Space: `O(|s|)` because the implementation converts `s` to a char array.
