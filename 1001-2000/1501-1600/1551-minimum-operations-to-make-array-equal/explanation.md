# Explanation

## Idea
- Sum `n - i` for the odd original values `i` below `n`.
- These terms measure how much each below-average element must increase.

## Why It Works
- Operations preserve the total sum, so the final common value must be the original average, `n`.
- Each operation transfers one unit from an above-average element to a below-average element. Thus the total deficit is both a lower bound and achievable using the matching total surplus.

## Edge Cases
- `n == 1` has no deficit and returns zero.
- For odd `n`, the central element already equals the average; for even `n`, no original element equals it.

## Complexity
- Time: $O(n)$ for roughly half as many additions as elements.
- Auxiliary space: $O(1)$; the array is never built.
