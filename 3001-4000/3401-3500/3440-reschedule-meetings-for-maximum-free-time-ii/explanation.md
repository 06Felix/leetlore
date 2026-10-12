## Idea

- Build gaps before, between, and after meetings. For each meeting, combine its two adjacent gaps. Include its duration too when a nonadjacent gap can hold the meeting; prefix and suffix maxima test that condition.

## Why It Works

- Moving a meeting within its neighboring span can merge both adjacent gaps. Relocating it to a separate gap frees the entire span, including its duration. These are the two possibilities for the span vacated by one moved meeting; unchanged gaps are also covered by the adjacent-gap candidates.

## Edge Cases

- A gap exactly equal to the meeting duration is sufficient. Boundary meetings use the gaps at zero and eventTime; a fully occupied event returns zero.

## Complexity

- O(n) time and O(n) auxiliary space.

## Notes

- The prefix and suffix maxima exclude both adjacent gaps, preventing an invalid claim that the meeting can move out of its span into that same span.
