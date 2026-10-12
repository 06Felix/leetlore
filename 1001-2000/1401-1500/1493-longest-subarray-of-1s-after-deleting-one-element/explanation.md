## Idea

- Maintain a sliding window with at most one zero. Maximize its length minus one.

## Why It Works

- Deleting the window’s zero gives only ones; when it has no zero, one one must still be deleted. Shrinking past a second zero restores the valid window invariant, and checking each right endpoint finds the optimum.

## Edge Cases

- All ones returns n−1, enforcing the mandatory deletion. All zeros or a one-element array returns zero.

## Complexity

- O(n) time and O(1) auxiliary space.
