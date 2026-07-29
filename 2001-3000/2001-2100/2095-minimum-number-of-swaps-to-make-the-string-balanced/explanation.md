# Explanation

## Idea

- Scan the string and keep `ct`, the number of unmatched opening brackets.
- For `[`, increment `ct`.
- For `]`, consume one unmatched opening bracket if possible.
- After the scan, `ct` counts unmatched openings left after all greedy matches.
- Each swap fixes two unmatched openings, so return `(ct + 1) / 2`.

## Why It Works

- Greedy matching removes every balanced pair already in correct relative order.
- The remaining imbalance corresponds to opening brackets that need to move left across bad closing brackets.
- One arbitrary swap can repair two unmatched openings in this reduced imbalance.
- Rounding up gives the minimum number of swaps needed.

## Edge Cases

- Already balanced strings return `0`.
- The shortest valid string is handled by the same scan.
- The algorithm uses only a counter, so very long strings are safe.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
