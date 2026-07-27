# Explanation

## Idea

Use two rolling states:

- `sell`: best profit while not holding stock
- `hold`: best profit while holding stock

The transaction fee is charged when entering the holding state.

## Why It Works

For each price, not holding after today is either the previous `sell` or selling the held stock today.

Holding after today is either the previous `hold` or buying today from the current not-holding profit and paying the fee.

These two states cover all valid positions because only one share can be held at a time.

## Edge Cases

- Zero fee reduces to ordinary unlimited transactions.
- If every transaction loses money, `sell` remains `0`.
- The first buy is allowed because `hold` starts as a very small value and then can become `sell - price - fee`.

## Complexity

Time: `O(n)`.

Space: `O(1)`.
