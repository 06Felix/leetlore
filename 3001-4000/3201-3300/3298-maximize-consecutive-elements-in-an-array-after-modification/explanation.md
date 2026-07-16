# Maximize Consecutive Elements in an Array After Modification

## Idea

- The solution sorts the array so values are processed from small to large.
- `f[x]` stores the best length of a consecutive selected sequence ending at value `x`.
- For each number `a[i]`, it can either stay as `a[i]` or be increased to `a[i] + 1`.
- The transitions extend sequences ending at the previous value.

## Why It Works

- Sorting ensures earlier processed numbers are no larger than the current number, so they can safely form prefixes of a consecutive sequence.
- Keeping a value at `x` can extend a sequence ending at `x - 1`.
- Increasing it to `x + 1` can extend a sequence ending at `x`.
- Taking maxima preserves the best achievable sequence ending at each value.

## Edge Cases

- A single element returns `1`.
- Duplicate values can split between unchanged and incremented choices.
- The array `f` is sized up to the largest value plus one for the incremented case.

## Complexity

- Time: $O(n \log n + M)$ only for allocation size `M` implicitly, with $O(n \log n)$ sorting and $O(n)$ transitions.
- Space: $O(M)$, where `M` is the maximum value in `nums`.
