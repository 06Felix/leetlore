## Idea

- Initialize dp[0] to zero and other amounts to an unreachable sentinel. For each coin, scan amounts upward and minimize dp[amount] with one plus the state smaller by that coin.

## Why It Works

- Every use of the current coin extends a previously achievable smaller amount. Upward scanning permits unlimited uses of the same denomination. Processing all coins therefore considers every multiset and keeps its minimum coin count.

## Edge Cases

- Amount zero returns zero. Coins larger than amount are skipped by the loop; an unreachable final state returns −1.

## Complexity

- O(coins·amount) time and O(amount) space.
