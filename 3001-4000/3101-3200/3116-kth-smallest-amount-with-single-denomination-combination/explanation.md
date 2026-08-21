# Kth Smallest Amount With Single Denomination Combination

## Idea

- Since different denominations cannot be combined, a valid amount is any positive number divisible by at least one coin.
- Binary search the answer: for a value `num`, count how many valid amounts are `<= num`.
- Count the union of multiples using inclusion-exclusion over LCMs of coin subsets.
- Before building subsets, remove redundant coins: if a coin is divisible by a smaller coin, it does not add any new valid amounts.

## Why It Works

- The answer is the smallest `num` such that at least `k` valid amounts are `<= num`.
- Multiples of one coin are easy to count with `num / coin`.
- Amounts divisible by multiple coins get counted more than once, so inclusion-exclusion adds odd-sized subsets and subtracts even-sized subsets using their LCM.
- Removing a coin divisible by an existing smaller coin is safe because all of its multiples are already multiples of that smaller coin.

## Edge Cases

- If coin `1` exists, every positive amount is valid.
- Large `k` needs `long` bounds because the answer can be much larger than `int`.
- Pairwise distinct coins can still be redundant, such as `2` and `4`.

## Complexity

- Time: `O(n log n + 2^m * m + 2^m * log answer)`, where `m` is the number of non-redundant coins.
- Space: `O(2^m)`

## Tags

- Binary Search
- Inclusion-Exclusion
- Math
- Number Theory
- Bit Manipulation
