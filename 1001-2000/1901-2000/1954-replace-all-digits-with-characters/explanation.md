# Replace All Digits with Characters

## Idea

- The solution converts the string to a mutable character array.
- It visits only odd indices, where the input guarantees digits appear.
- Each digit is converted to its numeric shift with `ans[i] - '0'`.
- The shifted character is computed from the previous character and written back into the array.

## Why It Works

- Every digit depends only on the immediately preceding even-indexed letter.
- Adding the numeric digit value to that letter gives the required shifted character.
- Even-indexed letters are left unchanged.
- The final array is converted back to a string.

## Edge Cases

- A length-one string has no odd index and is returned unchanged.
- Shift `0` preserves the previous character.
- The problem guarantees shifted characters do not pass `'z'`.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the character array.
