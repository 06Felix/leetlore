# Explanation

## Idea

Find the rook, then scan outward in the four rook directions.

Each direction stops at the board edge or at the first non-empty square.

## Why It Works

A rook can attack only along its row or column and cannot pass through another piece.

The first non-empty square in a direction determines that direction's result: if it is a pawn, it can be captured; if it is a bishop, it blocks the path.

Scanning all four directions counts every possible capture.

## Edge Cases

- Bishops before pawns block captures.
- Empty paths to the edge add nothing.
- The board always contains exactly one rook.

## Complexity

Time: `O(1)` because the board is always `8 x 8`.

Space: `O(1)`.
