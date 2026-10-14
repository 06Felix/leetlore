# Super Egg Drop

## Idea

- Count moves until the coverage DP reaches the number of floors. After each move, update dp[eggs] = dp[eggs] + dp[eggs - 1] + 1 in descending egg order.

## Why It Works

- A drop separates the tested floor, the lower floors searchable after a break, and the upper floors searchable after survival. This recurrence computes the maximum coverage for a move budget, so the first sufficient budget is minimal.

## Edge Cases

- One egg requires a linear scan; one floor takes one move. Descending updates use the previous move budget on both branches.

## Complexity

- O(E * M) time and O(E) space, where E is the egg count and M is the returned move count.

## Notes

- The implementation names the first argument n (eggs) and the second k (floors), opposite to the statement names; positional arguments are still correct. Coverage remains within int bounds under the given constraints.
