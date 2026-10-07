# Explanation

## Idea
- XOR all values to obtain the XOR of the two unique numbers.
- Isolate its lowest set bit using `(total & (total - 1)) ^ total`.
- Partition values by that bit and XOR each partition to recover one unique number.

## Why It Works
- Each duplicated value cancels under XOR, leaving only the two unique numbers' XOR, which is nonzero.
- A set bit marks a position where the unique numbers differ, placing them in different groups. Each duplicated pair stays in one group and cancels there.

## Edge Cases
- Zero and negative numbers work through their integer bit patterns.
- If the distinguishing bit is the sign bit, Java's fixed-width subtraction and bit operations still isolate it correctly.

## Complexity
- Time: $O(n)$ for two passes.
- Auxiliary space: $O(1)$, satisfying the problem's explicit requirement.
