## Idea

- Compute the prefix sum of required divisions by four using power-of-four blocks. Each query contributes ceil((prefix(r)−prefix(l−1))/2).

## Why It Works

- A positive value v needs floor(log₄ v)+1 divisions. Every operation performs two such divisions, so half the total rounded up is a lower bound. For consecutive ranges with l<r, the largest individual requirement is no greater than that bound; pairing the remaining work across elements attains it.

## Edge Cases

- At a power of four the required division count increases by one. A zero prefix contributes zero, and odd work totals are rounded up.

## Complexity

- O(queries+18) time and O(18) auxiliary space.

## Notes

- expSum4[t] stores the cumulative work through 4^t, including that endpoint. Long values hold the total across queries.
