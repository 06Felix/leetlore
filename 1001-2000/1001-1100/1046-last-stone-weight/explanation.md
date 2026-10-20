# Last Stone Weight

## Idea

- Place all stone weights in a max-heap. Pop the two largest, discard equal weights, and otherwise insert their positive difference. Return the sole survivor or zero.

## Why It Works

- The heap exposes exactly the two stones required by each game step. Replacing them according to the rule preserves the current game multiset, and every step reduces its size until the final state.

## Edge Cases

- A single stone is returned unchanged. Equal final stones leave an empty heap and answer zero.

## Complexity

- O(n log n) time and O(n) auxiliary space.

## Notes

- The input array is unchanged. Comparator subtraction is safe because weights never exceed the stated initial bound.
