## Idea
- Define dp[i][j] as the minimum health needed before entering that room to survive to the destination.
- Initialize the destination, fill the last row and column backward, then use max(1, min(right, down) - roomValue) for interior rooms.

## Why It Works
- Choosing the successor with the smaller health requirement minimizes the health needed here.
- Subtracting the current room's effect supplies that successor's required health after entry; clamping to one ensures the knight remains alive before and after the room.

## Edge Cases
- A single negative room requires one more health than its damage; a nonnegative singleton requires one.
- Single rows and columns use their sole available direction. Positive rooms can lower the required initial health, but never below one.

## Complexity
- O(mn) time because every room is processed once.
- O(mn) auxiliary space for dp; the dungeon is unchanged.
