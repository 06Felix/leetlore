# Explanation

## Idea
- Build `long` prefix sums so a subarray sum is the difference of two prefix entries.
- Keep candidate starting indices in a deque with strictly increasing prefix sums.
- Remove qualifying starts from the front while updating the best length, and remove dominated starts from the back before inserting the current index.

## Why It Works
- A qualifying front start has its shortest possible ending position now; any future end would only make its interval longer.
- If a later index has a prefix sum no greater than an earlier one, it produces at least as large a future subarray sum with a shorter length, so the earlier index can be discarded.
- These removals retain every start that could improve a future answer, even when array values are negative.

## Edge Cases
- A single qualifying element returns one; no qualifying nonempty interval returns `-1`.
- Equal prefix sums discard the earlier index, and `long` handles total sums beyond the integer range.

## Complexity
- Time: $O(n)$ because each index enters and leaves the deque at most once.
- Auxiliary space: $O(n)$ for prefix sums and the deque.
