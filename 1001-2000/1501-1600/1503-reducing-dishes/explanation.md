# Explanation

## Idea

- Sort satisfaction values.
- Traverse from largest to smallest while maintaining a suffix sum `ss`.
- Add a dish only while including it keeps the suffix sum positive.

## Why It Works

- Cooking selected dishes in increasing satisfaction order maximizes the weighted sum.
- When prepending a dish to the chosen schedule, every already chosen dish shifts one time unit later, increasing total score by the current suffix sum.
- If that suffix sum becomes non-positive, adding any smaller remaining satisfaction cannot improve the answer.

## Edge Cases

- All negative values stop immediately and return `0`.
- All positive values are all included.
- Zero values are included only when they help through later positive suffix contribution.

## Complexity

- Time: $O(n \log n)$ for sorting.
- Space: $O(1)$ extra beyond sorting implementation.
