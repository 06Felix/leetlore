## Idea

- Store values in a rows-by-26 array. Parse cell references into zero-based row/column indices, and evaluate a formula by independently reading or parsing its two operands.

## Why It Works

- Every set/reset writes exactly the referenced cell. Java arrays start at zero, matching unset-cell behavior. The formula contains only addition, so the sum of its resolved operands is the required result.

## Edge Cases

- Numeric zero, multi-digit row references, and unset cells are handled directly.

## Complexity

- O(rows·26) initialization and storage; O(L) time and temporary parsing space per call for argument length L.
