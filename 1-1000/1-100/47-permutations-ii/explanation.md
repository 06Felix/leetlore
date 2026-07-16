# Permutations II

## Idea

- The implementation generates permutations by swapping every possible value into the current index `l`.
- Once `l == h`, it copies the current array into a list.
- Because duplicates in `nums` can create the same permutation through different swap paths, it checks `res.contains(permutation)` before adding.
- Backtracking swaps the chosen value back before trying the next candidate.

## Why It Works

- The recursive swap process enumerates every ordering of the array positions.
- Every complete leaf represents one possible permutation of the input values.
- The containment check removes duplicate value sequences from the result.
- Swapping back restores the array for the next branch.

## Edge Cases

- A single-element input reaches the base case immediately.
- Inputs with repeated numbers may generate duplicate leaves, but only the first matching list is kept.
- Negative values require no special handling because values are only copied and compared.

## Complexity

- Time: $O(n! \cdot n \cdot u)$ in this implementation, where `u` is the number of unique permutations already stored, because each leaf builds a list and may scan `res`.
- Space: $O(n)$ recursion depth, plus $O(u \cdot n)$ for the returned permutations.

## Notes

- A frequency map or sorted-array duplicate skip would avoid generating duplicate leaves, but the submitted code uses result de-duplication.
