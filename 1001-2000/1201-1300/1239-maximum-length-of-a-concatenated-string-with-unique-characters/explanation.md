# Maximum Length of a Concatenated String with Unique Characters

## Idea

- Encode each internally unique string as a 26-bit mask and discard strings containing repeated letters. DFS over increasing indices, adding a string only when its mask is disjoint from used; maximize the used-bit count.

## Why It Works

- An internally repeated string can never belong to a valid concatenation. For the remaining strings, disjoint masks are exactly the condition for retaining character uniqueness. Increasing-index recursion explores every compatible subsequence without changing its order.

## Edge Cases

- The empty subsequence gives zero. Overlapping strings are skipped, and a single string with all letters can give 26.

## Complexity

- O(total input characters + m * 2^m) time as a conservative bound for m retained strings, and O(m) working space for masks and recursion.

## Notes

- The bit count equals concatenated length because every admitted character is unique. Input strings and their list are unchanged.
