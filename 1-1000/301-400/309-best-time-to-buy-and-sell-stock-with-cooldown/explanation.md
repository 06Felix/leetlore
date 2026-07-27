# Explanation

## Idea

Track three rolling values while scanning prices:

- `sell`: best profit while not holding stock after today
- `hold`: best profit while holding stock after today
- `prev`: previous day's `sell`, used to enforce cooldown before buying

## Why It Works

Selling today changes `sell` to `hold + price`, or it keeps the old `sell`.

Buying today changes `hold` to `prev - price`, where `prev` is the profit from before the cooldown day. This prevents buying immediately after a sale.

The best final state cannot be holding stock, so the answer is `sell`.

## Edge Cases

- A single price leaves `sell = 0`.
- Falling prices never force a transaction.
- `Integer.MIN_VALUE` prevents an invalid sell before any buy.

## Complexity

Time: `O(n)`.

Space: `O(1)`.
