# Explanation

Problem: [Maximum Score Words Formed by Letters](https://leetcode.com/problems/maximum-score-words-formed-by-letters/)

## Idea

Count available letters, then run DFS over word choices. For each candidate word, temporarily consume its letters; if valid, recurse on later words and maximize the score.

## Why It Works

Each word can be used at most once, so considering candidates only after index `s` enumerates subsets without duplicates. `useWord` subtracts the word's letters from the remaining counts and reports whether every count stayed non-negative. If the word is valid, its score can be combined with the best score from later words. `unuseWord` restores the counts after each branch, so other branches see the correct available letters. Taking the maximum over all valid choices returns the best achievable score.

## Edge Cases

- Words requiring unavailable letters are rejected when a count becomes negative.
- It is valid to choose no more words from a state, represented by the initial `ans = 0`.
- Zero-score valid words are skipped, which does not hurt the maximum score.

## Complexity

- Time: `O(2^w * L)`, where `w` is the number of words and `L` is max word length.
- Space: `O(w + 26)` for recursion and letter counts.
