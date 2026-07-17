# Explanation

## Idea

- Count the existing frequency of each lowercase letter.
- For every `?`, choose a letter with the current minimum frequency and increase that frequency.
- Sort the chosen replacement letters, then fill the `?` positions from left to right.

## Why It Works

- The value increases when a character appears many times before later equal characters.
- Assigning each `?` to the currently least frequent letter balances frequencies and minimizes added duplicate cost.
- Sorting the selected replacement multiset before placement gives the lexicographically smallest string among minimum-cost choices.

## Edge Cases

- If there are no `?` characters, the replacement list stays empty and the original letters are copied.
- Ties during frequency choice naturally prefer the smaller character because the scan goes from `a` to `z`.
- Long strings are handled with fixed-size frequency work per `?`.

## Complexity

- Time: $O(n \cdot 26 + q \log q)$, where `q` is the number of question marks.
- Space: $O(q + 26)$.
