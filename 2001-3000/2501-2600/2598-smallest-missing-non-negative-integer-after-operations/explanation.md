# Smallest Missing Non-negative Integer After Operations

## Idea

- Count normalized residues modulo val. Starting at zero, consume one element from the residue class needed by each consecutive candidate; stop when that class is exhausted.

## Why It Works

- Adding or subtracting val preserves residue, and any integer with that residue is reachable. Each covered candidate needs a distinct element; the first missing residue supply makes a longer consecutive prefix impossible.

## Edge Cases

- Normalize negative remainders. With val = 1, the answer equals nums.length.

## Complexity

- Expected O(n) time and O(min(n, val)) space for the HashMap.

## Notes

- The input array is unchanged.
