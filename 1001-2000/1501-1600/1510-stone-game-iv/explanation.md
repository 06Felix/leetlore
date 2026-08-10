# Stone Game IV

## Idea

This is a normal winning and losing state game.

Let:

```text
dp[i] = true if the current player can force a win with i stones
```

If there are `i` stones, the current player can remove any square number:

```text
1, 4, 9, 16, ...
```

After removing `j * j` stones, the opponent gets:

```text
i - j * j
```

If that remaining state is losing for the opponent, then the current state is winning.

## Transition

For every pile size `i`, try all square moves that fit:

```text
if dp[i - square] == false
    dp[i] = true
```

We stop as soon as one winning move is found.

If every possible move leaves the opponent in a winning state, then `dp[i]` stays `false`.

## Why It Works

A player wins if they can make at least one move that puts the opponent into a losing position.

A player loses if every legal move gives the opponent a winning position.

The DP fills states from small to large, so when computing `dp[i]`, all smaller states are already known.

## Edge Cases

- `n = 1`: Alice removes `1` stone and wins.
- Perfect squares are always winning because Alice can remove all stones immediately.
- Some non-square values can still be winning if they can move to a losing state.

## Complexity

- Time: `O(n * sqrt(n))`
- Space: `O(n)`

## Tags

- Dynamic Programming
- Game Theory
- Math
