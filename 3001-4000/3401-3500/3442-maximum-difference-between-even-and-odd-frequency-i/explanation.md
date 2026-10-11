# Maximum Difference Between Even and Odd Frequency I

## Idea
- Count the 26 letter frequencies, then find the largest odd count and smallest positive even count.
- Return their difference.

## Why It Works
- The odd and even character choices are independent, so maximizing the first count and minimizing the second maximizes their difference.
- Ignoring zero counts ensures the even-frequency character actually occurs in the string.

## Edge Cases
- The answer may be negative and is returned without clamping.
- The statement guarantees both frequency types exist; the fallback for an absent even count is outside the required input domain.

## Complexity
- Time: $O(n+26)$ for counting and scanning frequencies.
- Space: $O(n+26)$ because `toCharArray()` copies the input; the frequency table itself is constant-sized.
