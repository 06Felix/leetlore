# Best Time to Buy and Sell Stock using Strategy

## Idea

- Build prefix sums of original strategy profit. Slide a sum of prices for the second half of each k-day modification window; its first half contributes zero. Add unchanged profit before and after the window, and compare with no modification.

## Why It Works

- The replacement action pattern gives exactly the second-half price sum. Prefix sums remove the original window contribution without altering any other day, so evaluating every window plus the original strategy considers every legal choice.

## Edge Cases

- k may equal the full array length. Keeping the original profit handles cases where every modification is harmful.

## Complexity

- O(n + k) time. The implementation retains a fixed O(MAX_SIZE) static prefix array of 100001 longs; conceptually O(n) prefix storage.

## Notes

- The input arrays are unchanged. The shared static prefix array is cleared for each call but makes concurrent calls unsafe without external synchronization.
