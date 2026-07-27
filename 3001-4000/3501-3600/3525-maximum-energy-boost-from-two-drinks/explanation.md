# Explanation

Problem: [Maximum Energy Boost From Two Drinks](https://leetcode.com/problems/maximum-energy-boost-from-two-drinks/)

## Idea

- Keep `dpA[i]` as the best total ending hour `i` by drinking A.
- Keep `dpB[i]` as the best total ending hour `i` by drinking B.
- Continuing the same drink uses the previous hour's same-drink state.
- Switching drinks must skip one hour, so it uses the opposite drink from `i - 2`.
- Return the better of the two states at the last hour.

## Why It Works

- If hour `i` uses A, the previous contributing state is either A at `i - 1` or B at `i - 2` because switching requires a no-boost hour.
- The recurrence takes the better of those valid choices and adds `energyDrinkA[i]`.
- The same argument holds symmetrically for B.
- These recurrences cover all valid schedules and preserve the best total for each ending drink.
- The optimal full schedule must end with either A or B at the last hour.

## Edge Cases

- The first hour initializes both possible starting drinks.
- The `i > 1 ? ... : 0` branch handles switches near the beginning.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$.

## Notes

- The problem constraints have `n >= 3`; the implementation still handles `n == 0`.
