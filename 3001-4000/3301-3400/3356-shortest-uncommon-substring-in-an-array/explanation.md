# Shortest Uncommon Substring in an Array

## Idea

- The solution precomputes the set of all substrings for each string.
- For each index `i`, it unions all substring sets from the other strings.
- It then scans every substring of `arr[i]`.
- The best answer is the shortest substring not present in the other-set, with lexicographic order breaking ties.

## Why It Works

- A substring is uncommon for `arr[i]` exactly when it is absent from every other string's substring set.
- Precomputing per-string sets makes membership checks direct.
- Trying every substring of `arr[i]` ensures no candidate is missed.
- Updating on shorter length or lexicographically smaller equal length enforces the output rule.

## Edge Cases

- If every substring appears elsewhere, the answer remains empty.
- Single-character uncommon substrings are found before longer ones if present.
- Duplicate substrings inside one string do not matter because sets are used.

## Complexity

- Time: $O(n^2 L^2)$ in this implementation for `n` strings of length up to `L`, plus substring construction costs.
- Space: $O(n L^2)$ for substring sets.
