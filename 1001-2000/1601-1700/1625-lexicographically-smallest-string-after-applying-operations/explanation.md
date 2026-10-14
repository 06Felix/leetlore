# Lexicographically Smallest String After Applying Operations

## Idea

- Explore reachable strings with a queue and HashSet. For each string, generate both the odd-index digit addition and the right rotation, and retain the lexicographically smallest visited string.

## Why It Works

- Every legal sequence is a path in this state graph. Expanding both operations from every newly discovered state visits all reachable strings; comparing all of them finds the minimum.

## Edge Cases

- Leading zeroes remain part of the string. Cyclic operations terminate because already seen states are skipped.

## Complexity

- O(R * n) time and space for R reachable strings of length n. R is at most 100n: at most n rotations and ten additive offsets for each parity.

## Notes

- Even rotations preserve parity; odd rotations allow additions to affect both parity classes.
