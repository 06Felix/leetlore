## Idea

- Count all even and odd values for constant-parity subsequences. Separately track the best alternating subsequence ending in each parity, then return the largest of these four possibilities.

## Why It Works

- A fixed adjacent-sum parity of zero forces all values to share parity. A sum parity of one forces alternating parities. For the latter, each new value extends the best subsequence ending in the opposite parity, covering both possible starting parities.

## Edge Cases

- Repeated equal-parity values do not extend an alternating sequence but all contribute to the constant-parity candidate.

## Complexity

- O(n) time over two scans and O(1) space.
