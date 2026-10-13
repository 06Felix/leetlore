## Idea

- Store remaining character quotas and a total required count. Expand right, decrement quotas, then shrink valid windows while recording the shortest; stop shrinking once a required character is lost.

## Why It Works

- Nonnegative quotas after adding a character identify a still-needed occurrence. Negative quotas represent extras. While required is zero, the window covers every target multiplicity. Removing from the left until a quota turns positive finds the shortest covering window for each right endpoint.

## Edge Cases

- Repeated target characters are counted separately. If no covering window exists, return an empty string.

## Complexity

- O(s length+t length) time and O(t length+128) auxiliary space for target toCharArray and quotas, plus the returned substring.
