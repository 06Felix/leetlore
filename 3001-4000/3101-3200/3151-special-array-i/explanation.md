# Explanation

## Idea
- Scan each adjacent pair and compare their low bits.
- Return false on equal parity, otherwise true after the scan.

## Why It Works
- The low bit is one for an odd integer and zero for an even integer.
- Every adjacent pair must have different parity. Testing all of them directly implements that condition.

## Edge Cases
- A singleton has no adjacent pairs and returns true.
- One same-parity pair is sufficient to reject the array, even if all other pairs alternate.

## Complexity
- Time: $O(n)$, with possible early exit.
- Auxiliary space: $O(1)$.
