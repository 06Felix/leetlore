# 3789. Minimum Cost to Acquire Required Items

## Idea

- Consider how many type 3 items to buy. The total cost changes linearly until one requirement is filled, then changes linearly again.
- A linear cost reaches its minimum at a boundary, so only three counts of type 3 items matter: none, `min(need1, need2)`, or `max(need1, need2)`.
- Calculate all three totals and return the smallest.

## Why It Works

- Buying no type 3 items means satisfying both requirements separately.
- Buying `min(need1, need2)` type 3 items covers both requirements together as far as possible, then fills the larger remaining requirement with its single-item type.
- Buying `max(need1, need2)` type 3 items can be cheaper when a type 3 item costs less than the required single-item type, even though it overfills the other requirement.
- No count between these boundaries can beat both of its surrounding boundary choices because the cost is linear in that range.

## Edge Cases

- If either requirement is zero, the formulas still handle buying nothing or using only type 3 items.
- Products use `long` because costs and requirements can both reach $10^9$ and $10^6$ respectively.

## Complexity

- Time: $O(1)$.
- Space: $O(1)$.

## Tags

- Math
- Greedy
