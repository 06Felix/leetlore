# Subarray Sums Divisible by K

## Idea

- Track prefix sum remainders modulo `k`.
- `ct[r]` stores how many previous prefixes had remainder `r`.
- For each number, update the normalized current remainder `cur`.
- Add `ct[cur]` to the answer, then record the current prefix.

## Why It Works

- A subarray sum is divisible by `k` when its ending and starting prefix sums have the same remainder.
- `ct[cur]` counts all valid starts for a subarray ending at the current index.
- Initializing `ct[0] = 1` counts subarrays starting at index `0`.
- `(cur + num % k + k) % k` keeps remainders non-negative even for negative numbers.

## Edge Cases

- Single-element arrays work through the same prefix logic.
- Negative numbers are normalized before indexing `ct`.
- Zero-sum or already divisible prefixes are counted because of the initial zero remainder.

## Complexity

- Time: $O(n)$.
- Space: $O(k)$.
