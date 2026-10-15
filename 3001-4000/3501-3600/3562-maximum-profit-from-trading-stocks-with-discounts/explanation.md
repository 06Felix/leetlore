# Maximum Profit from Trading Stocks with Discounts

## Idea

- Run tree knapsack DP. For every employee and budget, retain two answers depending on whether their boss bought a stock. Merge child budgets separately for the employee-buying and employee-skipping cases, then compare skipping with buying at the appropriate price.

## Why It Works

- Subtrees interact only through the budget split and whether their immediate boss buys. If this employee skips, children receive no discount; if they buy, children receive it. Trying every child budget allocation and both purchase choices covers every feasible investment plan.

## Edge Cases

- A discounted stock may cost zero. Buying an individually unprofitable boss can still be worthwhile because it unlocks child discounts; the DP keeps this option.

## Complexity

- O(n * B^2) time and O(n * B) worst-case auxiliary space, including retained tables along recursion, for budget B.

## Notes

- Only purchase costs consume budget; future proceeds are counted as profit, never reinvested. The recurrence matched exhaustive purchase subsets on 250 small random hierarchies.
