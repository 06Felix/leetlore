# Maximum Product of Two Digits

## Idea

To get the maximum product of two digits, we only need the two largest digits in `n`.

The number is scanned from right to left using:

```text
digit = n % 10
```

For each digit, the code updates:

- `first`: largest digit seen so far
- `second`: second largest digit seen so far

If the current digit is greater than or equal to `first`, it becomes the new largest digit and the old `first` moves to `second`.

This also handles the case where the same digit appears more than once. For example, in `997`, the first `9` becomes `first`, and the second `9` pushes the old `9` into `second`.

## Why It Works

The product of two decimal digits is maximized by choosing the two largest available digits.

Any smaller digit can only keep the product the same or make it smaller, because all digits are non-negative.

So after scanning all digits, `first * second` is the best possible answer.

## Edge Cases

- Repeated largest digits are handled by `dig >= first`.
- Zeroes are naturally allowed, but they will only be chosen if there are not two better digits.
- The method assumes `n` has at least two digits, as required by the problem constraints.

## Complexity

- Time: `O(d)`, where `d` is the number of digits in `n`.
- Space: `O(1)`.

## Tags

- Math
- Digits
- Greedy
