## Idea

- Scan maximal runs of consecutive values and format each as a singleton or start->end.

## Why It Works

- Sorted unique values permit a range extension exactly when the next value is one greater. A gap must separate ranges to avoid covering absent integers; each maximal consecutive run therefore yields one necessary range.

## Edge Cases

- Empty input returns no ranges. Singletons use no arrow. A maximum-int endpoint cannot have a later larger entry, so the guarded adjacency check cannot wrongly join across overflow.

## Complexity

- O(n) time plus output formatting and O(1) auxiliary space beyond returned strings.
