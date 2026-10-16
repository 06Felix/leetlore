# Kth Largest Element in a Stream

## Idea

- Maintain a min-heap with at most k values. Insert every initial and added score, removing the smallest whenever the size exceeds k. Return the heap minimum after each add.

## Why It Works

- Removing the minimum from k + 1 candidates leaves the k largest scores seen so far. Their minimum is precisely the kth largest, including duplicates as separate scores. This invariant holds after each insertion.

## Edge Cases

- The constructor may start with k - 1 scores; the first add then provides enough values. k = 1 keeps the maximum.

## Complexity

- O(N log(k + 1)) construction time, O(log(k + 1)) per add, and O(k) storage.

## Notes

- The heap is private per object. The helper name heapify denotes insert-and-trim here, not linear-time bulk heap construction.
