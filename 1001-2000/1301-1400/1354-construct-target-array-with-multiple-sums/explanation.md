# Construct Target Array With Multiple Sums

## Idea

- Work backward with a max-heap and a long total. Remove the largest entry, let rest be the sum of all others, and replace the largest by largest % rest. Reject zero remainders or unchanged values; accept immediately when rest is one.

## Why It Works

- The latest forward replacement creates the largest entry from the preceding total. Reversing it subtracts the unchanged sum of the other entries. Modulo batches repeated subtractions of that same rest value. Positive decreasing predecessors are necessary, and reaching all ones certifies a construction.

## Edge Cases

- One-element targets are possible only for [1]. rest = 1 permits reducing the remaining value to one without treating a zero remainder as failure.

## Complexity

- O((n + I) log(n + 1)) time and O(n) space for I reverse iterations. Each successful replacement more than halves its changed value, giving the conservative bound I = O(n log V) for maximum target value V.

## Notes

- The input is unchanged. Long arithmetic prevents total-sum overflow; positive entries and n > 1 ensure the modulo divisor is nonzero.
