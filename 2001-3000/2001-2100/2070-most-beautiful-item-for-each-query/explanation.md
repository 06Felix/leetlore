# Explanation

## Idea
- Sort items by price and build a prefix array of the best beauty seen so far, with zero for the empty prefix.
- For each query, binary-search the first item with a price greater than the query.
- Return the prefix maximum at that position.

## Why It Works
- Sorting makes every affordable item belong to one prefix.
- Searching for the first strictly greater price includes every item priced exactly at the query, including duplicates.
- The prefix maximum is exactly the best beauty among all affordable items, and the empty-prefix value handles no affordable item.

## Edge Cases
- Queries below all prices return zero; queries at or above the largest price use the full prefix.
- Duplicate prices and repeated query values need no special handling.

## Complexity
- Time: $O(n \log n + q \log n)$ for `n` items and `q` queries.
- Auxiliary space: $O(n)$ for prefix values, the unused allocated price array, and object-array sorting workspace, excluding output.

## Notes
- Sorting reorders the input item rows. The allocated `prices` array is unused in the existing implementation.
