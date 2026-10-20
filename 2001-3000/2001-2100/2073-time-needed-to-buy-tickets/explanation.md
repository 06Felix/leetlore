# Time Needed to Buy Tickets

## Idea

- Let x be the target person’s requested ticket count. People at or before k contribute min(tickets[i], x); later people contribute min(tickets[i], x - 1). Sum these contributions using the code’s equivalent branches.

## Why It Works

- Before the target’s final purchase, the queue completes x - 1 potential rounds. In the final round, only positions through k are served. Each person also stops when their own demand runs out, giving the two capped contributions.

## Edge Cases

- If x = 1, people after k contribute zero. A person with fewer tickets finishes in an earlier round.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The implementation counts purchases without simulating the queue or modifying tickets. The total fits int under the bounds.
