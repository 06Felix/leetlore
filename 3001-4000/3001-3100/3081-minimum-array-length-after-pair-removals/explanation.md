# Explanation

## Idea

Use two pointers on the sorted list. The left pointer starts in the first half and the right pointer starts at `n / 2`.

Whenever `nums[i] < nums[j]`, pair and remove those two values logically.

## Why It Works

Each valid removal needs a smaller value paired with a larger value. Starting the larger pointer in the second half leaves enough candidates to pair with the smaller half.

Greedily matching the current smallest unpaired left value with the earliest larger right value maximizes the number of removable pairs.

The answer is the original length minus twice the number of matched pairs.

## Edge Cases

- Equal values cannot be paired, so the right pointer advances.
- If all values are equal, no pairs are removed.
- Odd lengths leave at least one element.

## Complexity

Time: `O(n)`.

Space: `O(1)`.
