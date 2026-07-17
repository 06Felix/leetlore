# Explanation

## Idea

- Return whether `n` is even.
- The parity fully determines the winner under optimal play.

## Why It Works

- If `n` is even, Alice can choose `1`, leaving an odd number for Bob.
- From any odd number, every valid divisor is odd, so subtracting it gives an even number.
- Alice can keep returning Bob to odd numbers until Bob reaches `1` and loses.
- If `n` is odd initially, Alice must give Bob an even number, so Bob has the winning parity strategy.

## Edge Cases

- `n = 1` returns `false`; Alice has no valid move.
- `n = 2` returns `true`; Alice subtracts `1`.
- Large values are handled by one modulo operation.

## Complexity

- Time: $O(1)$.
- Space: $O(1)$.
