# Maximum Total Importance of Roads

## Idea

- Count each city's degree in `ct`.
- Sort the degree counts ascending.
- Assign value `1` to the smallest degree, `2` to the next, and so on.
- Add `(i + 1) * ct[i]` to compute total importance.

## Why It Works

- Each city contributes its assigned value once per incident road.
- Therefore total importance equals the sum of `value(city) * degree(city)`.
- To maximize that sum, larger values should go to larger degrees.
- Sorting degrees and pairing them with increasing values implements this exchange-optimal assignment.

## Edge Cases

- Cities with degree `0` get small values and add nothing.
- Multiple cities with equal degree can receive any order among tied values.
- `long` is used because the total can exceed `int`.

## Complexity

- Time: $O(n \log n + r)$ for `r = roads.length`.
- Space: $O(n)$ for degree counts.
