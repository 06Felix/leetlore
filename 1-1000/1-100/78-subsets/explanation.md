## Idea
- Enumerate every mask from zero through 2^n - 1.
- For each mask, add nums[j] exactly when bit j is set, then append the resulting subset.

## Why It Works
- Each mask gives a unique include/exclude choice for every element.
- These choices are in bijection with all subsets; unique input elements ensure no duplicate subset values.

## Edge Cases
- Mask zero contributes the empty subset; the all-set mask contributes the full array.
- Negative and zero values are handled exactly like positive values. The shift is safe for n <= 10.

## Complexity
- O(n 2^n) time to inspect all bits and create the output.
- O(n 2^n) output space, with O(n) temporary subset space.
