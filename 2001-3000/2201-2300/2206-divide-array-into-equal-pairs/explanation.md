## Idea
- Count each value in a fixed array of 501 frequencies.
- Reject any odd frequency and accept when every frequency is even.

## Why It Works
- Equal pairs consume two occurrences of one value, so even counts are necessary.
- They are also sufficient: independently pair occurrences of each value to use every element exactly once.

## Edge Cases
- A value occurring many times is valid if its frequency is even.
- Two different odd frequencies still fail, even though the total array length is even.

## Complexity
- O(n + 501) time and O(501) auxiliary space, both linear-time/constant-space under the fixed value bound.
- Input is unchanged.
