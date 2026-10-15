# Factorial Trailing Zeroes

## Idea

- Return n / 5 plus the result for n / 5 recursively, stopping at zero.

## Why It Works

- Every factor five in n! pairs with an abundant factor two to form a trailing zero. Multiples of five contribute once, multiples of 25 once more, and so on; repeated division sums exactly these contributions.

## Edge Cases

- 0! and factorials below five have zero trailing zeroes. Powers of five contribute multiple factors from the same integer.

## Complexity

- O(log(n + 1)) time and recursion stack space, with logarithm base five.

## Notes

- The factorial is never constructed, and the recursion meets the logarithmic-time follow-up.
