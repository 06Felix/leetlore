# 3Sum Closest

## Idea
- Initialize the best sum from the first three elements, then sort the array.
- Fix each distinct first value and scan the remaining suffix with two pointers. Update the best sum whenever its distance to the target improves; return immediately on an exact match.

## Why It Works
- For a fixed first value, a sum below the target cannot improve by reducing the right value, so advancing the left pointer safely discards that left endpoint.
- A sum above the target similarly permits discarding the right endpoint. Every discarded combination is no closer than a sum already considered.
- Considering every distinct first value covers all possible triples; skipping equal first values only removes redundant searches.

## Edge Cases
- Three-element inputs return their only possible sum; repeated or negative values are supported.
- The stated bounds keep sums, target differences, and absolute differences safely within `int`.

## Complexity
- $O(n^2)$ time, including $O(n\log n)$ sorting.
- $O(\log n)$ sorting stack space for the usual Java primitive-array sort; the pointer scan uses $O(1)$ extra space.

## Notes
- Sorting mutates the input. On equal distances the earlier best remains; the statement guarantees a unique answer.
