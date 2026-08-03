# Stone Game III

## Idea

Instead of tracking Alice's and Bob's scores separately, track the score difference.

Let:

```text
dp[i] = best score difference the current player can get starting from index i
```

Score difference means:

```text
current player's total - other player's total
```

If the current player takes some stones worth `sum`, then the opponent starts from the next index. The opponent's best advantage from there is `dp[next]`, so the current player's net advantage is:

```text
sum - dp[next]
```

The current player chooses the best among taking 1, 2, or 3 stones.

## Transition

From index `i`, try all valid moves:

```text
take stone i
take stones i and i + 1
take stones i, i + 1, and i + 2
```

For each move:

```text
candidate = sum of taken stones - dp[index after taken stones]
```

Then:

```text
dp[i] = max(candidate)
```

The array is filled from right to left because `dp[i]` depends on future states.

## Why It Works

Both players are optimal, so every state can be viewed as "current player versus opponent".

Once the current player chooses a move, the opponent also plays optimally on the remaining suffix. Subtracting `dp[next]` correctly accounts for that future advantage.

So `dp[0]` gives Alice's final score difference over Bob:

- positive: Alice wins
- negative: Bob wins
- zero: tie

## Edge Cases

- Negative stone values are handled naturally because the player still must take 1 to 3 stones.
- Near the end of the array, the inner loop only takes available stones.
- A zero final difference means both players end with the same score.

## Complexity

- Time: `O(n)` because each index tries at most 3 moves.
- Space: `O(n)`.

## Tags

- Dynamic Programming
- Game Theory
- Minimax
- Array
