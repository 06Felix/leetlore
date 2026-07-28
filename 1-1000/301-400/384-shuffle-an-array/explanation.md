# Explanation

## Idea

Keep the original array reference for `reset`. For `shuffle`, clone it and run Fisher-Yates from the end toward the front.

At index `i`, choose a random `j` in `[0, i]` and swap.

## Why It Works

Fisher-Yates fixes one position at a time. When processing index `i`, every remaining element has equal probability of being chosen for that position.

Repeating this down to index `1` makes every permutation equally likely.

Cloning before shuffling avoids mutating the stored original array.

## Edge Cases

- A one-element array remains unchanged.
- `reset()` returns the original configuration.
- Values are unique under the constraints, but the shuffle logic does not rely on uniqueness.

## Complexity

Time: `O(n)` per `shuffle`, `O(1)` for `reset`.

Space: `O(n)` for the shuffled clone.
