# Investments in 2016

## Idea

- Use window counts to annotate each policy with its 2015-value frequency and its latitude-longitude frequency. Keep rows with a repeated 2015 value and a unique location, then sum and round their 2016 values.

## Why It Works

- Window functions count against the complete original table without collapsing policy rows. Applying both predicates afterward preserves exactly qualifying policies, and the final aggregate adds each qualifying amount once.

## Edge Cases

- A policy sharing its city is excluded even if the other policy fails the investment predicate. A duplicate investment value alone is not enough.

## Complexity

- Typically O(I log I) time for window partition sorting and O(I) workspace for I policies, depending on the execution plan.

## Notes

- No qualifying rows make SUM return SQL NULL; the query does not replace it with zero. The original query passed a SQLite fixture; MySQL was not executed.
