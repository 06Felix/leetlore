## Idea
- Sort all pizza weights. Let D be the number of days: there are ceil(D / 2) odd days and floor(D / 2) even days.
- Take the largest weights directly for odd-day gains. For each even day, skip one remaining largest weight as Z and take the next as the gain Y.

## Why It Works
- An odd-day gain needs one high pizza, whereas an even-day gain needs both its counted pizza and a pizza at least as large. Exchanging a larger even-day support or gain into an odd-day gain never reduces the total, so the largest weights can be reserved for odd days.
- Among the remaining high weights, pairing consecutive largest values maximizes the sum of pair minima, which are the even-day gains.
- All unselected smaller pizzas fill the three lower positions of each odd group and two lower positions of each even group. Groups can then be placed on their matching day types.

## Edge Cases
- One day gains the overall maximum.
- Equal weights are harmless; both odd and even numbers of days use their corresponding quotas. Long stores the potentially large gain total.

## Complexity
- O(N log N) time for N pizzas, followed by O(N) selection.
- O(log N) sorting-stack space for the primitive array; the selection itself uses O(1) space.

## Notes
- The implementation sorts pizzas in place.
