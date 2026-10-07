# Explanation

## Idea
- Encode each row by whether each bit agrees with that row's first bit.
- Count identical encodings in a map and return the largest group size.

## Why It Works
- Two rows can both become internally constant using the same column flips exactly when they are identical or bitwise complements.
- Comparing every bit with the first bit gives identical signatures for these two cases and different signatures otherwise.
- Flipping according to any row in a signature group makes every row in that group all zeros or all ones, so its full size is achievable.

## Edge Cases
- With one column, every row already has all values equal and all signatures match.
- Complementary rows count together even though their final constant bits differ; repeated rows also contribute separately.

## Complexity
- Expected time: $O(RC)$ for `R` rows and `C` columns, including string construction and hashing.
- Auxiliary space: $O(RC)$ worst case for stored signatures.
