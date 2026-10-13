## Idea

- Return numBottles + floor((numBottles−1)/(numExchange−1)).

## Why It Works

- After drinking the initial bottles, each exchange followed by drinking its result decreases the empty-bottle count by numExchange−1. An exchange is possible only while at least numExchange empties remain, leaving at least one afterward. This gives exactly the additional count in the formula.

## Edge Cases

- Fewer initial bottles than the exchange cost gives no extra drink. The constraint numExchange≥2 keeps the denominator positive.

## Complexity

- O(1) time and space.
