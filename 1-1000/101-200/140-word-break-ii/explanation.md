# Explanation

Problem: [Word Break II](https://leetcode.com/problems/word-break-ii/)

## Idea

Use backtracking from each string index. At every position, try every next prefix that appears in the dictionary, append it to the current path, and recurse from the following index.

## Why It Works

Every valid sentence is a sequence of dictionary words whose concatenation is `s`. The DFS enumerates exactly those sequences by choosing one valid dictionary word starting at the current index, then solving the remaining suffix. When the index reaches the end of `s`, the current path covers the whole string, so joining the path with spaces creates one valid sentence. Backtracking removes the last word so other choices from the same prefix can be explored.

## Edge Cases

- If no word matches at some index, that branch contributes no sentence.
- The same dictionary word can be reused because the dictionary set is not mutated.
- A string with no valid full split returns an empty answer list.

## Complexity

- Time: `O(n * 2^n)` in the worst case, plus the cost of building output strings.
- Space: `O(n)` recursion/path space, excluding the returned sentences.

## Notes

The implementation does not memoize suffix results. That is acceptable for the imported constraints (`s.length <= 20`) but would repeat work for larger inputs.
