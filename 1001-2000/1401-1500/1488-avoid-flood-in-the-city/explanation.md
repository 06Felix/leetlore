## Idea

- Use a successor union-find over day indices and remember each lake’s most recent rain. Remove rainy days from the available indices; on repeated rain, assign the earliest available dry day after the previous rain.

## Why It Works

- Each repeated rain needs one unused dry day strictly between its two rain dates. Processing repetitions by increasing deadline and taking the earliest eligible slot preserves later slots for future constraints; an exchange argument replaces any later feasible slot with this earlier slot. Union-find skips days already unavailable.

## Edge Cases

- If the successor is at or after today, return an empty result. Unused dry days keep the harmless default lake one.

## Complexity

- O(n log n) conservative amortized time for path compression without union-by-rank, and O(n) space.

## Notes

- Runtime risk: recursive find can traverse a long successor chain, potentially overflowing the Java stack on large inputs. The stored solution is unchanged.
