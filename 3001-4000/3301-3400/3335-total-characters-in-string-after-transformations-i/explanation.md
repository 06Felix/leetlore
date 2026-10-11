# Total Characters in String After Transformations I

## Idea
- Count the starting letters, then apply each transformation to a fresh 26-entry frequency array.
- Shift counts from `a` through `y` to the next letter, and split every `z` into contributions to `a` and `b`.

## Why It Works
- Each transformation depends only on the source letter, so frequencies capture every contribution without constructing the expanded string.
- A fresh array applies replacements simultaneously; `b` receives both old `a` and old `z` counts.
- Summing final frequencies gives the length, and modular reduction preserves the required answer.

## Edge Cases
- A round with no `z` preserves length; `z` occurrences increase length by their count.
- Overlapping contributions to `b` are added rather than overwritten. Two reduced counts sum safely within `int`.

## Complexity
- Time: $O(|s|+26t)$ for counting and simulation.
- Space: $O(|s|+26)$ because `toCharArray()` copies the input; the frequency simulation itself uses $O(26)$ live storage.
