# Maximize the Minimum Powered City

## Idea

- Binary-search the first infeasible minimum power. Each check clones stations and scans cities with a rolling coverage sum. If a city is deficient, place exactly the deficit at the rightmost station position that still covers it, spending from k.

## Why It Works

- Every deficit must be supplied before leaving that city. Placing additions as far right as possible preserves coverage of the current city while extending help furthest into the unprocessed suffix. This greedy check uses the minimum necessary budget; feasibility is monotone, so binary search returns the best feasible target.

## Edge Cases

- r = 0 treats cities independently. Zero extra stations tests existing coverage. Near the right boundary, additions are placed at n - 1.

## Complexity

- O(n log B) time and O(n) working space, where B = sum(stations) + k + 1. Each check scans and clones n entries.

## Notes

- Only cloned arrays are modified. Coverage and search limits use long; each station entry remains within int range because at most k <= 10^9 stations are added overall.
