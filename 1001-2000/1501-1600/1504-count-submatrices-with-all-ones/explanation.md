## Idea

- Maintain column heights of consecutive ones. At each cell, scan left while heights are positive and add the minimum height for each possible left boundary.

## Why It Works

- For a fixed bottom row and horizontal span, every height from one through the span’s minimum forms an all-one rectangle. Each rectangle has a unique bottom row and pair of horizontal boundaries, so it is counted once.

## Edge Cases

- A zero resets that column height and stops any span crossing it. Single-row and single-column matrices work directly.

## Complexity

- O(rows·columns²) time and O(columns) auxiliary space.
