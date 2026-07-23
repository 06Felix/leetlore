# Number of Unique XOR Triplets I

## Idea

The array is a permutation of `1..n`, so the order of `nums` does not really matter.

For any three chosen indices `i <= j <= k`, the value is:

```text
nums[i] XOR nums[j] XOR nums[k]
```

XOR is commutative, so choosing values first and then sorting their indices gives the same result. Also, repeated indices are allowed, so the same number can be used more than once.

That means the problem is the same as asking:

```text
How many different values can we make using a XOR b XOR c,
where a, b, c are chosen from 1..n?
```

## Small Cases

For `n = 1`, only `1` is available:

```text
1 XOR 1 XOR 1 = 1
```

So the answer is `1`.

For `n = 2`, the only useful values are `1` and `2`. Repeating the same number cancels two copies:

```text
1 XOR 1 XOR 2 = 2
1 XOR 2 XOR 2 = 1
```

So the answer is `2`.

## Main Observation

For `n >= 3`, we can create every value from:

```text
0 to nextPowerOfTwo(n) - 1
```

So the answer becomes:

```text
nextPowerOfTwo(n)
```

Here `nextPowerOfTwo(n)` means the smallest power of two strictly greater than `n`.

Examples:

```text
n = 3  -> values 0..3  -> answer 4
n = 4  -> values 0..7  -> answer 8
n = 8  -> values 0..15 -> answer 16
```

## Why All Values Are Possible

Let `high` be the highest power of two that is `<= n`.

Every answer must be below `2 * high`, because all numbers from `1..n` fit in those bits.

Now take any target value `x` in this range.

If `x` is already between `1` and `n`, we can make it directly:

```text
x XOR 1 XOR 1 = x
```

If `x = 0`, then for `n >= 3`:

```text
1 XOR 2 XOR 3 = 0
```

For values greater than `n`, the top bit must be the `high` bit. Write:

```text
y = x XOR high
```

Now `y` is smaller than `high`.

We need two numbers whose XOR is `y`, and then we include `high` as the third number.

Most of the time:

```text
1 XOR (1 XOR y) = y
```

If `y = 1`, use:

```text
2 XOR 3 = 1
```

All these numbers are within `1..n`, because `high <= n` and `n >= 3`.

So every value in the full power-of-two range is reachable.

## Algorithm

The code only needs `n`.

- If `n < 3`, return `n`.
- Otherwise, start with `ans = 1`.
- Keep doubling `ans` until it becomes greater than `n`.
- Return `ans`.

## Complexity

- Time: `O(log n)`
- Space: `O(1)`

## Tags

- Bit Manipulation
- Math
- XOR
- Combinatorics
