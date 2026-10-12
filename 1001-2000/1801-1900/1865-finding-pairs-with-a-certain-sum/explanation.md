## Idea

- Keep the arrays and a frequency map for nums2. Updates decrement the old value’s count and increment the new value’s count. Queries sum the frequency of target−value for each entry of nums1.

## Why It Works

- The update preserves the map’s exact multiplicities. For a fixed nums1 index, each complementary nums2 occurrence gives one valid pair; summing over all first-array indices counts every pair once.

## Edge Cases

- Duplicates contribute their full multiplicity. Missing complements contribute zero; keys with zero frequency are harmless.

## Complexity

- Expected O(m) initialization, O(1) add, and O(n) count. Map space is O(m+u) after u updates because zero-frequency keys remain.

## Notes

- The object retains the supplied arrays and mutates nums2 in add. The stated value and call limits keep integer values and pair totals within int.
