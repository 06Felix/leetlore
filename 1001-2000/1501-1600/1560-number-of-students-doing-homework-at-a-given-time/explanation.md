# Number of Students Doing Homework at a Given Time

## Idea

- The solution scans every student interval once.
- It checks whether `queryTime` is at least the start time and at most the end time.
- Each interval containing `queryTime` increments the answer.

## Why It Works

- The prompt defines a student as busy exactly when `queryTime` lies in `[startTime[i], endTime[i]]`.
- The condition `sT[i] <= qT && eT[i] >= qT` is that inclusive interval test.
- Counting all intervals that pass this test gives the number of busy students.

## Edge Cases

- A student starting and ending exactly at `queryTime` is counted.
- Query times before a start or after an end are not counted.
- The arrays have equal length by constraint, so matching indices are safe.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
