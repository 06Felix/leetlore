# Maximum Product of Word Lengths

## Idea

- Convert each word to a 26-bit mask of contained letters.
- Compare every pair of words.
- If `(mask[i] & mask[j]) == 0`, the words share no letters.
- Maximize `words[i].length() * words[j].length()` over valid pairs.

## Why It Works

- Each bit represents whether a letter appears in the word.
- A bitwise AND is zero exactly when no letter appears in both masks.
- Checking all pairs guarantees the maximum valid product is found.
- Duplicate letters inside one word do not affect the mask, which is fine because only sharing matters.

## Edge Cases

- If every pair shares a letter, `ans` remains `0`.
- Single-character words are handled by one-bit masks.
- The product fits in `int` under the constraints.

## Complexity

- Time: $O(nL + n^2)$ for `n` words and total word scanning cost `nL`.
- Space: $O(n)$ for masks.
