# Rank Scores

## Idea

- Apply DENSE_RANK over score descending, then order the returned rows by score descending.

## Why It Works

- DENSE_RANK assigns the same rank to equal scores and increments once per distinct lower score, exactly avoiding gaps after ties. The outer ordering independently guarantees the requested result order.

## Edge Cases

- Duplicate scores remain separate output rows with equal rank. The highest score receives rank one.

## Complexity

- Typically O(S log S) sorting time and O(S) execution workspace for S scores; indexes and the query plan can change physical costs.

## Notes

- The original query passed a SQLite window-function fixture. MySQL execution was not tested.
