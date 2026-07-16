# Greatest Common Divisor Traversal

## Idea

- The implementation uses union-find over numeric values up to the maximum input value.
- It rejects arrays longer than one that contain `1`, because `1` shares no factor greater than one.
- It counts which values appear, then unions present multiples with their prime-like factor representative during a sieve-style scan.
- Finally, every input value must have the same root as `nums[0]`.

## Why It Works

- Two values are connected if they share any factor greater than one, directly or through other values.
- Unioning a factor with every present multiple connects all values that share that factor.
- Repeating this over possible factors builds the same connected components as gcd-based traversal.
- If all input values have the same union-find root, every index can reach every other index.

## Edge Cases

- A single value returns `true`.
- Any `1` in a multi-element array returns `false`.
- Duplicate values are counted but connectivity is determined by their numeric value's root.

## Complexity

- Time: about $O(M \log M)$ for maximum value `M` due to the multiples scan.
- Space: $O(M)$ for count, parent, and visited arrays.
