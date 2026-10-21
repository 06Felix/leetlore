# Make Sum Divisible by P

## Idea

- Find the total remainder r modulo p. Scan prefix remainders while mapping each remainder to its latest index; for current ps, seek (ps - r + p) % p to identify the shortest ending subarray whose removal cancels r.

## Why It Works

- A removed interval must have sum congruent to the total remainder. Subtracting prefix remainders gives precisely that interval residue. Keeping the latest matching earlier index minimizes its length, and considering all ends finds the global minimum.

## Edge Cases

- Already divisible totals return zero. A map entry 0 -> -1 permits prefix removals. A candidate of full-array length is rejected by returning -1.

## Complexity

- Expected O(n) time and O(min(n, p)) auxiliary space.

## Notes

- The total uses long. Rolling ps + nums[i] stays below 2000000000 under the bounds, so int arithmetic is safe. The input is unchanged. Actual Java matched 2000 brute-force removal cases.
