# Count Covered Buildings

## Idea

- Record minimum and maximum y for each x, and minimum and maximum x for each y. Count buildings strictly between both corresponding pairs of extrema.

## Why It Works

- Having a smaller and larger coordinate on the same line is exactly the existence of a building on each side along that axis. Satisfying both strict interval tests supplies all four required directions.

## Edge Cases

- An extreme building on either line is uncovered. Buildings need not be immediately adjacent to provide coverage.

## Complexity

- O(n + b) time and O(n) auxiliary space for city side length n and b buildings.

## Notes

- The directional variable names are secondary to their indexing: north/south are y-extrema at fixed x, and west/east are x-extrema at fixed y. The input is unchanged.
