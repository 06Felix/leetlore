# Merge Nodes in Between Zeros

## Idea

- Skip the leading zero.
- Walk each segment between zeros and accumulate its sum.
- Append one new list node with that segment sum.
- Move past the segment-ending zero and repeat.

## Why It Works

- The input guarantees zero delimiters at the beginning and end, with no consecutive zeros.
- Every non-zero node belongs to exactly one segment between two zeros.
- Summing until the next zero creates the required merged value for that segment.
- The dummy node simplifies building the output list.

## Edge Cases

- A segment with one node creates that node's value as the sum.
- The final zero stops the inner loop and then exits after advancing to `null`.
- The original list is not reused; the method creates a new result list.

## Complexity

- Time: $O(n)$.
- Space: $O(g)$ for `g` merged groups in the returned list.
