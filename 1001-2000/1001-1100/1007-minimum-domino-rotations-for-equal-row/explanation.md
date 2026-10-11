# Minimum Domino Rotations For Equal Row

## Idea
- Count each face value in the top row, bottom row, and both halves of the same domino.
- A value can fill a row when `top + bottom - both` equals the number of dominoes; return `n - max(top, bottom)` for the first feasible value.

## Why It Works
- Inclusion-exclusion counts the dominoes containing the target on at least one side, which is exactly the feasibility requirement.
- Filling the top needs one rotation per top mismatch, and filling the bottom needs one per bottom mismatch. Taking the smaller count gives the formula.
- If two different values are feasible, every domino must contain both, so they have identical minimum rotation counts. Returning the first feasible value is therefore safe.

## Edge Cases
- Doubles are subtracted once in feasibility and never require rotation when they match the target.
- A row already uniform returns zero; no feasible value returns `-1`.

## Complexity
- Time: $O(n)$ plus checking six possible values.
- Space: $O(1)$ for three fixed-size count arrays.
