## Idea
- Store the first index of each element value, shifted by one so zero means absent.
- For each group size, enumerate divisors up to its square root and inspect both members of each factor pair. Return the smallest stored index, or -1.

## Why It Works
- Every divisor belongs to a factor pair with one member at most the square root, so enumeration finds every eligible element value.
- Keeping only the earliest occurrence of each value and minimizing over divisors gives the required smallest element index.

## Edge Cases
- Repeated element values retain their first index.
- Perfect-square factor pairs may be checked twice harmlessly; element one divides every group, and an element can serve multiple groups.

## Complexity
- O(V + e + g sqrt(V)) time, including initializing the value table, where V = 100,000, e is the element count, and g is the group count.
- O(V) auxiliary space plus O(g) result space.
