# Explanation

## Idea
- Store one slot counter for each car type at indices one through three.
- `addCar` compares the counter's old value with zero and decrements it using post-decrement.

## Why It Works
- The first calls up to a type's initial capacity see positive counters and return true.
- Once its capacity is exhausted, every later call sees a nonpositive counter and returns false. Each type has an independent counter.

## Edge Cases
- A zero-capacity type rejects its first car and all later cars.
- Repeated rejected calls do not change results for other car types.

## Complexity
- Time: $O(1)$ for construction and each operation.
- Space: $O(1)$ for four counters.

## Notes
- Rejected calls also decrement the counter, so it can become negative rather than representing actual free spaces. Under the stated call limit, this preserves the required boolean behavior without integer overflow.
