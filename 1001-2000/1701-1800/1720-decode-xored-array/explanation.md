# Explanation

## Idea
- Allocate an output array one element longer than the encoded input and place `first` at index zero.
- Recover each following value by XORing the previous decoded value with the corresponding encoded value.

## Why It Works
- From $encoded[i] = original[i] \oplus original[i+1]$, XOR cancellation gives $original[i+1] = original[i] \oplus encoded[i]$.
- The known first value uniquely determines every subsequent value, so the recurrence reconstructs the whole array.

## Edge Cases
- An encoded zero makes the next decoded value equal to the previous one.
- Zero as the first value works with the same recurrence; the last encoded value fills the final output slot.

## Complexity
- Time: $O(n)$ for decoded length `n`.
- Space: $O(n)$ for the returned array and $O(1)$ additional storage.
