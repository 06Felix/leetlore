## Idea

- Store each class in a max-priority queue keyed by the gain from adding one passing student. Repeatedly update the class with largest gain, then average the resulting ratios.

## Why It Works

- The gain for p/t is (t−p)/(t(t+1)). After adding a passing student its numerator stays fixed and the denominator grows, so gains decrease. Selecting the largest available marginal gain at every step optimizes the sum of class ratios, and dividing by the fixed class count preserves the optimum.

## Edge Cases

- Classes already at a perfect ratio have zero gain. Equal gains can be assigned in either order.

## Complexity

- O((n+k) log(n+1)) time, including initialization and final heap draining, and O(n) space.

## Notes

- The priority keys and ratios use double; each updated record is removed and reinserted with its new gain.
