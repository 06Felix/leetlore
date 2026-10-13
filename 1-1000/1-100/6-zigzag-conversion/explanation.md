## Idea

- Create a builder for every row. Append characters while moving the row pointer downward then upward, reversing direction at the top and bottom, and concatenate all row builders.

## Why It Works

- The bouncing pointer follows exactly the zigzag’s vertical and diagonal path. Each character is assigned to its correct row, and concatenating row contents gives the required row-by-row reading.

## Edge Cases

- With one row, the direction stays zero. If there are more rows than characters, unused builders remain empty.

## Complexity

- O(length+numRows) time and O(length+numRows) space.
