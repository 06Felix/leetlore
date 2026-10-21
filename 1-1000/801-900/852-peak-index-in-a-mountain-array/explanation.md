# Peak Index in a Mountain Array

## Idea

- Scan interior indices and return the first element larger than both neighbors.

## Why It Works

- A guaranteed mountain array has exactly one interior peak, and that peak is the only index satisfying both strict comparisons. The scan eventually reaches it.

## Edge Cases

- The constraints guarantee a peak strictly inside the array. The fallback value 1193 is unreachable for valid mountains.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The linear scan violates the explicit O(log n) time requirement. It returns the correct peak for valid mountain inputs but does not use the required logarithmic search. Source is unchanged.
