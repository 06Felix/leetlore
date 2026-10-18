# Insert Delete GetRandom O(1) - Duplicates allowed

## Idea

- Store every occurrence in a dense items list and map each value to its list of occurrence indices. Each Item also stores its position in that value’s index list. Remove one occurrence by moving the final Item into its slot and updating that Item’s index entry.

## Why It Works

- The back-reference permits updating the moved occurrence without searching. Removing list tails keeps both structures dense and consistent, including when the removed and moved values are equal. Uniform random item indices give probability proportional to each value’s multiplicity.

## Edge Cases

- Removing an absent value returns false. Inserting another copy returns false but still inserts it. Removing the final occurrence deletes the map entry.

## Complexity

- Expected amortized O(1) per insert/remove/getRandom and O(N) live storage for N occurrences.

## Notes

- The record-based implementation requires a Java version supporting records. The actual source passed 5000 mixed differential operations; random checks verified membership, not a statistical distribution guarantee.
