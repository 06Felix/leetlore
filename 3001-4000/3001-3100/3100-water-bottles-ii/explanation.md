## Idea

- Use the quadratic formula to compute the number of exchanges, then add it to the initial bottles.

## Why It Works

- With t exchanges, exchange costs are k through k+t−1. Each exchanged bottle returns one empty after drinking, so net consumption is t(k−1)+t(t−1)/2. Feasibility requires this to be at most n−1. Solving the quadratic and taking the integer floor gives the stored expression.

## Edge Cases

- If the initial bottles cannot cover the first exchange, the additional count is zero. k=1 permits the first exchange and then raises its cost.

## Complexity

- O(1) time and space.

## Notes

- The square-root expression matched direct simulation for all 10000 inputs with 1≤n,k≤100.
