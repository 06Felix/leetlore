## Idea
- Compare every pair of strings, accepting identical strings or exactly two mismatches whose character pairs reverse each other.
- Union each accepted pair and count union-find roots after all comparisons.

## Why It Works
- A single swap changes at most two positions; reversed mismatches are exactly the ones that swap repairs.
- The similarity graph's connected components are the required groups, including chains whose endpoints are not directly similar. Union-find computes those components.

## Edge Cases
- Duplicate strings merge without a swap.
- One mismatch, more than two mismatches, or a nonreversed pair is rejected. A singleton forms one group.

## Complexity
- O(n² L + n³) is a conservative time bound: pair comparisons scan up to L characters, and unbalanced recursive finds can take O(n) each.
- O(n) auxiliary space for parents and recursion.

## Notes
- Union uses path compression without rank or size balancing; the balanced-union inverse-Ackermann bound should not be assumed.
