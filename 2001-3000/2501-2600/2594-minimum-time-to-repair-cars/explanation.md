## Idea
- Binary-search time from zero to fastestRank × cars².
- At time T, sum floor(sqrt(T / rank)) across mechanics and test whether this reaches cars.

## Why It Works
- A rank-r mechanic finishes c cars exactly when r c² <= T, giving the floor-square-root capacity.
- Mechanics work simultaneously, so capacities add. They are nondecreasing with time, allowing a search for the first sufficient time; the upper bound lets the fastest mechanic repair everything alone.

## Edge Cases
- A single mechanic reduces to rank × cars².
- Long protects the time bound and counts. Integer division before sqrt preserves the mathematical floor-square-root result.

## Complexity
- O(n log U) time, where U = minimumRank × cars².
- O(1) auxiliary space; ranks is unchanged.

## Notes
- The code uses Math.sqrt and implicit truncation in compound assignment, rather than an integer square-root routine. Within the stated bounds the count total stays below 2^53, avoiding loss of integer precision in that conversion.
