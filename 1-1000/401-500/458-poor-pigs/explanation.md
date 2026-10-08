# Explanation

## Idea
- Compute the outcomes per pig as `minutesToTest / minutesToDie + 1`.
- Starting with capacity one and zero pigs, repeatedly multiply capacity by that outcome count until it covers all buckets.

## Why It Works
- A pig can die in any completed testing round or survive them all, giving the computed number of distinguishable outcomes.
- With `p` pigs, there are `outcomes^p` outcome combinations. Assigning a distinct combination to each bucket identifies the poisonous one, and fewer combinations cannot distinguish all buckets.

## Edge Cases
- One bucket needs zero pigs.
- When only one testing round fits, each pig has two possible outcomes; incomplete extra time adds no round.

## Complexity
- Time: $O(\log_{outcomes}(buckets))$, with zero iterations for one bucket.
- Auxiliary space: $O(1)$.

## Notes
- The loop has an intentionally empty body; its update multiplies the capacity and increments the pig count. The given bounds keep this capacity within the integer range.
