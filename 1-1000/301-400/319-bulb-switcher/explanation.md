# Bulb Switcher

## Idea

- A bulb is toggled once for every divisor of its position.
- Most divisors come in pairs.
- Only perfect squares have an odd number of divisors.
- Return the count of perfect squares up to `n`, which is `floor(sqrt(n))`.

## Why It Works

- Bulbs start off, so a bulb ends on only if it is toggled an odd number of times.
- Position `i` is toggled in exactly the rounds that divide `i`.
- Non-square positions have paired divisors and an even toggle count.
- Square positions have one unpaired square-root divisor and remain on.

## Edge Cases

- `n = 0` returns `0`.
- `n = 1` returns `1`.
- Large `n` is handled directly by `Math.sqrt`.

## Complexity

- Time: $O(1)$.
- Space: $O(1)$.
