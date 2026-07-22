# Explanation

Problem: [Filling Bookcase Shelves](https://leetcode.com/problems/filling-bookcase-shelves/)

## Idea

- Let `dp[i]` be the minimum height needed for the first `i` books.
- For each ending book `i`, scan backward to choose which previous books share the last shelf.
- Track total thickness and maximum height for that last shelf.
- Stop scanning when the shelf width would be exceeded.

## Why It Works

- In any valid arrangement for the first `i + 1` books, the last shelf contains some contiguous suffix of those books.
- The backward loop tries every suffix that fits within `shelfWidth`.
- For a chosen suffix starting at `j`, the best total height is `dp[j] + maxHeight`, because earlier books are independent of the last shelf.
- Taking the minimum over all fitting suffixes gives the optimal value for `dp[i + 1]`.

## Edge Cases

- A shelf containing only the current book is always considered.
- The loop breaks as soon as width is exceeded because adding more earlier books can only increase thickness.

## Complexity

- Time: $O(n^2)$.
- Space: $O(n)$.

## Notes

- Book order is preserved because the last shelf is always a contiguous suffix.
