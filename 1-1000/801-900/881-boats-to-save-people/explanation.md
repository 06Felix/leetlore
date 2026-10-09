## Idea
- Sort weights and keep pointers at the lightest and heaviest remaining people.
- Give the heaviest a boat, pairing with the lightest if their sum fits; otherwise send the heaviest alone.

## Why It Works
- If the lightest cannot share with the heaviest, no remaining person can, so a solo boat is necessary.
- If they fit, an optimal solution can pair them by exchanging partners without increasing boats: any displaced partner of the lightest is no heavier than the heaviest, so it can share with the heaviest's displaced partner.

## Edge Cases
- One remaining person consumes one boat, regardless of the code's doubled-weight comparison.
- Equal weights and sums exactly equal to limit are handled normally.

## Complexity
- O(n log n) time for sorting, followed by O(n) pointer movement.
- O(log n) sorting-stack space; the people array is sorted in place.
