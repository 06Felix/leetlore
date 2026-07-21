# Patching Array

## Idea

- Maintain `miss`, the smallest positive sum not yet coverable.
- Initially, no sums are covered, so `miss = 1`.
- If the next array value is `<= miss`, use it to extend coverage.
- Otherwise, patch in `miss` itself, which doubles the covered range.

## Why It Works

- If all sums below `miss` are coverable, adding a number `x <= miss` makes all sums below `miss + x` coverable.
- If the next number is greater than `miss`, no existing number can form `miss`, so a patch is necessary.
- Patching exactly `miss` gives the largest possible coverage extension with one patch.
- Repeating until `miss > n` covers the full target range.

## Edge Cases

- Arrays already covering `[1, n]` add no patches.
- Missing `1` forces the first patch to be `1`.
- `miss` is `long` to avoid overflow while expanding toward `2^31 - 1`.

## Complexity

- Time: $O(nums.length + p)$ where `p` is the number of patches.
- Space: $O(1)$.
