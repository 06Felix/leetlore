## Idea

- Treat a deque as a stack of processed values. Repeatedly merge the next value with the stack top when their gcd exceeds one, replacing the pair with their lcm.

## Why It Works

- The processed stack has no mergeable neighbors. Only its top can conflict with a newly appended value, and each merge may create another conflict to its left. Rechecking restores the invariant. Since the statement guarantees order-independent results, this terminating sequence produces the required final array.

## Edge Cases

- One is coprime with every value and stays separate. Cascading merges can consume several stack entries.

## Complexity

- O(n log V) time for amortized O(n) gcd checks and O(n) stack/output space, where V bounds intermediate values.

## Notes

- The lcm multiplication is widened to long. Intermediate merged values divide a final merged value and therefore fit the given 10⁸ bound.
