# Explanation

## Idea

The solution sorts pairs by their ending value, then greedily takes the next pair whose start is greater than the end of the last chosen pair.

This is the same greedy structure as selecting the maximum number of non-overlapping intervals.

## Why It Works

Choosing the available pair with the smallest ending value leaves the most room for future pairs. If a valid chain can start with some later-ending pair, replacing it with the earlier-ending valid pair cannot make future choices worse.

Repeating that exchange argument proves the greedy scan builds an optimal chain.

## Edge Cases

- `prevEnd` starts at `Integer.MIN_VALUE`, so any valid first pair can be chosen.
- Pairs with `pair[0] <= prevEnd` cannot follow the current chain and are skipped.
- Negative endpoints work because sorting and comparison use the actual values.

## Complexity

Time: `O(n log n)` for sorting.

Space: `O(1)` extra aside from sort implementation stack/storage.

## Notes

The comparator subtracts endpoints. This is fine for the LeetCode constraints here, though `Integer.compare` is usually safer in general Java code.
