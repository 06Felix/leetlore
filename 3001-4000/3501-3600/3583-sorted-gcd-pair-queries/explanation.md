# Explanation

## Idea

- Count, for every possible divisor `d`, how many input numbers are divisible by `d`.
- For each possible `gcd` from high to low, start with all pairs divisible by it.
- Subtract pairs already assigned to larger multiples of that gcd to get pairs whose exact GCD is `gcd`.
- Prefix-sum those exact counts by gcd value.
- Answer each sorted-position query with binary search on the prefix counts.

## Why It Works

- If both numbers are divisible by `g`, their pair contributes to a candidate count for GCD `g`.
- Some of those pairs have larger exact GCDs, which must be removed.
- Processing from large to small ensures all larger-multiple exact counts are already known when subtracting them.
- The prefix array represents the sorted `gcdPairs` value distribution, so the first gcd whose prefix count exceeds query index is the answer.

## Edge Cases

- Duplicate numbers are counted by combinations from divisor frequencies.
- Query indices are zero-based, so the binary search looks for `q + 1`.
- The arrays are sized from the maximum value in `nums`, avoiding unnecessary range work.

## Complexity

- Time: about `O(sum(sqrt(nums[i])) + M log M + Q log M)`, where `M = max(nums)`.
- Space: `O(M + Q)`.
