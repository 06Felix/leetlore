# Next Greater Element I

## Idea

- The implementation records each value's index in `nums2`.
- For each value in `nums1`, it scans rightward in `nums2` from that index.
- The first larger value found is returned.
- If no larger value appears, the answer is `-1`.

## Why It Works

- `nums1` values are guaranteed to appear in `nums2`.
- The next greater element is defined as the first greater value to the right in `nums2`.
- A direct rightward scan checks candidates in exactly that order.
- Returning at the first greater value satisfies the definition.

## Edge Cases

- Values at the end of `nums2` return `-1`.
- Values with no greater element to their right return `-1`.
- The fixed index array is valid because values are constrained to `0..10000`.

## Complexity

- Time: $O(|nums1| \cdot |nums2|)$ in the worst case.
- Space: $O(10001)$ for the index array.

## Notes

- The follow-up asks for a monotonic-stack solution, but the submitted implementation uses direct scanning.
