# Explanation

## Idea
- XOR all derived bits and return whether the result is zero.
- No original array needs to be constructed.

## Why It Works
- XORing every adjacent-pair expression makes each original bit appear twice, so any valid derived array has total XOR zero.
- Conversely, choose any first original bit and recover successive bits using the derived values. The final wraparound equation holds exactly when the derived XOR is zero.

## Edge Cases
- For one element, only derived bit zero is possible.
- All-zero derived values permit a constant original array; an odd number of derived ones fails.

## Complexity
- Time: $O(n)$ for one pass.
- Auxiliary space: $O(1)$.
