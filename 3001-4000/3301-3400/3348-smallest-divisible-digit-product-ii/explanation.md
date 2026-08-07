# Smallest Divisible Digit Product II

## Idea

The product of digits from a zero-free number can only contain prime factors from:

```text
2, 3, 5, 7
```

Digits `1..9` cannot contribute any other prime factor. So if `t` still has another prime factor after removing all `2`, `3`, `5`, and `7`, the answer is impossible.

The goal is to build the smallest zero-free number that is at least `num` and whose digit product covers the prime-factor needs of `t`.

## Factor State

The code stores how many factors are still needed:

```text
(need2, need3, need5, need7)
```

For example:

```text
t = 72 = 2^3 * 3^2
state = (3, 2, 0, 0)
```

Each digit reduces this state:

```text
8 gives three 2s
9 gives two 3s
6 gives one 2 and one 3
5 gives one 5
7 gives one 7
```

## Minimum Digits Needed

`calc(a, b, c, d)` returns the minimum number of digits needed to cover the remaining state.

It tries digits `2..9`, reduces the state, and takes the best result.

Digit `1` is skipped because it does not help cover any factor. A digit that does not reduce the current state is also skipped; otherwise the recursion would call itself with the same state.

This is memoized, so each factor state is solved once.

## Building the Answer

First, the code checks whether `num` itself already works:

- it must contain no zero
- its digit product must cover all required factors

If not, the code tries to make the smallest possible same-length answer.

It scans positions from right to left. At each position, it tries to increase that digit and then checks whether the suffix has enough length to satisfy the remaining factors.

For a candidate digit:

```text
remaining factors after prefix + candidate
```

If:

```text
calc(remaining) <= suffix length
```

then this position can work.

The suffix is then built greedily from left to right by trying digits `1..9` and picking the smallest digit that still leaves a feasible remaining state.

## Handling Zeros

The answer must be zero-free.

If `num` contains a zero, any unchanged suffix after that zero would still be invalid. So when trying to modify the same-length number, the code only changes a position at or before the first zero.

That guarantees the final number has no zero.

## If Same Length Is Impossible

If no same-length number works, the answer must be longer than `num`.

For a longer number, any zero-free number with length greater than `num.length()` is automatically greater than `num`.

So the code builds the smallest feasible number of length:

```text
max(num.length() + 1, calc(full requirement))
```

Extra positions can always be filled with `1`.

## Complexity

Let `S` be the number of possible factor states.

- Prefix scan: `O(n)`
- Same-length search: `O(9n)`
- DP states: `O(8S)`
- Building suffix: `O(9n)`
- Space: `O(n + S)`

The state count is small because `t <= 10^14`.

## Tags

- Digit DP
- Greedy
- Math
- Prime Factorization
- Memoization
