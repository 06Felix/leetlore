## Idea

Sort and take consecutive triples. Reject the partition if any triple’s largest minus smallest value exceeds k.

## Why It Works

For the smallest remaining value, any feasible triple needs two values within k of it. The next two sorted values are the smallest choices; exchanging them into that triple cannot worsen the other groups. Repeating this choice yields a feasible partition whenever one exists.

## Edge Cases

Duplicates and k smaller than a triple’s span are handled directly. The input length is guaranteed to be divisible by three.

## Complexity

O(n log n) time; O(n) result storage and O(log n) sorting stack.

## Notes

Sorting modifies the input array.
