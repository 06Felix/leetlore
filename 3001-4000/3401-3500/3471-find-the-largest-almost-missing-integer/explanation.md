## Idea
- If k equals n, return the largest value because there is only one window.
- If k is one, return the largest globally unique value.
- Otherwise, only globally unique endpoint values can qualify; count occurrences of the first and last values and choose the larger qualifying endpoint.

## Why It Works
- For 1 < k < n, every interior position belongs to at least two windows, whereas each endpoint belongs to exactly one.
- A value occurring at any other position therefore cannot be confined to its endpoint window. Global uniqueness of an endpoint is necessary and sufficient.

## Edge Cases
- Equal first and last values appear in two distinct endpoint windows and cannot qualify; the code's else-if counting still correctly rejects them.
- n = 1 takes the full-window branch. No qualifying value returns -1.

## Complexity
- O(n) expected time in every branch.
- O(n) auxiliary space for the k = 1 frequency map; O(1) otherwise.
