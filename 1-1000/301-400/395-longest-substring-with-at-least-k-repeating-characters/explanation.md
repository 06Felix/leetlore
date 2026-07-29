# Explanation

## Idea

- Try every possible number of distinct characters from `1` to `26`.
- For a fixed distinct-count target `n`, use a sliding window.
- Track `unq`, the number of distinct letters in the window, and `kFreq`, the number of letters whose frequency is at least `k`.
- When `unq` exceeds `n`, shrink from the left.
- A window is valid for this pass when `kFreq == n`.

## Why It Works

- Any valid substring has some distinct-letter count between `1` and `26`.
- The outer loop eventually chooses that exact count.
- For that fixed count, the sliding window keeps only windows with at most that many distinct letters.
- If all `n` distinct letters have reached frequency `k`, then every character in the window satisfies the requirement.
- Taking the best over all distinct counts gives the global best substring length.

## Edge Cases

- If `k` is larger than the string length, no window reaches `kFreq == n`, so the answer stays `0`.
- Repeated equal letters are handled by frequency counts.
- Lowercase-only input keeps the alphabet bound fixed at `26`.

## Complexity

- Time: `O(26n)`, which is `O(n)`.
- Space: `O(1)`.
