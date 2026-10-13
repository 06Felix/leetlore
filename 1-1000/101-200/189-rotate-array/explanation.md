## Idea

- Reduce k modulo the array length. Reverse the whole array, then reverse the first k values and the remaining suffix separately.

## Why It Works

- Whole-array reversal moves the final k original values into the prefix, but reverses each group’s internal order. Reversing the groups restores their order, producing exactly the right rotation.

## Edge Cases

- k=0 reverses the whole array twice. The input is guaranteed nonempty, making modulo safe.

## Complexity

- O(n) time and O(1) auxiliary space.
