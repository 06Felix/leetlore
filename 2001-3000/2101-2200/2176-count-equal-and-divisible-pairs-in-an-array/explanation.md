# Count Equal and Divisible Pairs in an Array

## Idea
- Enumerate all index pairs with the second index strictly after the first.
- Count pairs whose values match and whose index product is divisible by `k`.

## Why It Works
- Every eligible index pair is visited exactly once, and the condition directly checks both requirements.
- Equal values alone are insufficient; divisibility uses the indices, not their array values.

## Edge Cases
- Any matching pair involving index zero satisfies divisibility because its product is zero.
- Length one has no pairs; when `k = 1`, all equal-value pairs qualify. Products and counts fit `int` for $n\le100$.

## Complexity
- Time: $O(n^2)$ for pair enumeration.
- Space: $O(1)$ auxiliary storage.
