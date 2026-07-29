# 4Sum II

## Idea

- Count all pair sums from `nums3` and `nums4` in a hash map.
- For every pair from `nums1` and `nums2`, look up how many second-half pairs have the opposite sum.
- Add those frequencies to the answer.

## Why It Works

- A tuple sums to zero exactly when `(nums1[i] + nums2[j]) + (nums3[k] + nums4[l]) == 0`.
- The map stores how many `(k, l)` pairs produce each second-half sum.
- Looking up `-(x + y)` counts every compatible second-half pair for the current first-half pair.

## Edge Cases

- Duplicate values are counted correctly because the map stores frequencies of index pairs.
- Negative sums and zero sums are handled by integer hash keys.
- The answer is accumulated over all first-half pairs.

## Complexity

- Time: `O(n^2)`.
- Space: `O(n^2)` for the pair-sum map.
