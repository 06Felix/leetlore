# Minimum Number of Operations to Make All Array Elements Equal to 1

## Idea

- Count existing ones and compute the overall GCD. Existing ones need one conversion per non-one; a non-unit overall GCD makes the task impossible. Otherwise repeatedly sweep left to right, replacing nums[i] by gcd(nums[i], nums[i + 1]), until the first one appears.

## Why It Works

- After t sweeps, each updated entry represents the GCD of up to t + 1 consecutive original values. The first one therefore identifies a shortest unit-GCD subarray of length L, requiring L - 1 operations to create a one. Propagating that one needs another n - 1 operations, giving n + L - 2, returned as n + index.

## Edge Cases

- An existing one avoids sweeps. An overall GCD greater than one is invariant under allowed updates, so -1 is necessary.

## Complexity

- O(n^2 log V) worst-case time and O(log V) recursive GCD stack space, where V = max(nums).

## Notes

- The sweep modifies nums. It uses every adjacent-pair GCD as a search computation; the answer counts an optimal creation and propagation sequence, rather than the number of assignments performed by these sweeps.
