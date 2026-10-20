# Final Prices With a Special Discount in a Shop

## Idea

- Clone prices and scan left to right with a stack of unresolved indices. While the current price is no greater than a stacked price, pop that index and subtract the current price from its answer.

## Why It Works

- Every stacked index has seen no qualifying later discount yet. The first current price meeting its threshold is therefore the minimum qualifying index. Popping resolves that item permanently, while unresolved items retain their original price.

## Edge Cases

- Equal prices qualify for the discount. Increasing prices remain unresolved and unchanged.

## Complexity

- O(n) time and O(n) auxiliary stack space, plus the returned clone.

## Notes

- Each index is pushed and popped at most once. The original prices array is unchanged.
