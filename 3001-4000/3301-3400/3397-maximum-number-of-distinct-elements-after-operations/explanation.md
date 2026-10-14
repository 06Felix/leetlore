# Maximum Number of Distinct Elements After Operations

## Idea

- Sort nums and assign each usable interval [num - k, num + k] the smallest integer larger than the previous assigned value. Skip intervals whose upper endpoint cannot exceed that value.

## Why It Works

- Both interval endpoints are sorted. Choosing the earliest feasible integer leaves maximum room for later intervals; exchanging any larger choice for this one cannot reduce future assignments. An interval ending at or before the previous assignment cannot add a new increasing value.

## Edge Cases

- k = 0 counts distinct original values; duplicates are spread only while their intervals have room.

## Complexity

- O(n log n) time; O(log n) sorting stack space and O(1) additional scan space.

## Notes

- Sorting mutates nums. Under the constraints, endpoints and cur + 1 remain within int range.
