# Best Time to Buy and Sell Stock V

## Idea

- Maintain flat, long-position, and short-position profit states for each transaction allowance. For each new price, scan allowances downward, close positions using their previous values, then open positions using the previous day’s lower-allowance flat state.

## Why It Works

- A long closes by adding the price and a short closes by subtracting it. Opening from the previous day’s lower allowance reserves one transaction. Descending allowances and closing before opening prevent using a just-closed position to start another transaction on the same day.

## Edge Cases

- All transaction allowances initially permit opening on day zero. Returning a flat state excludes unfinished positions; skipping trades keeps profit nonnegative.

## Complexity

- O(n * k) time and O(k) auxiliary space.

## Notes

- Profit uses long. The implementation matched exhaustive disjoint transaction schedules on 300 small random arrays, including both normal and short transactions.
