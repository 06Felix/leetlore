# Explanation

Problem: [Create a DataFrame from List](https://leetcode.com/problems/create-a-dataframe-from-list/)

## Idea

- Pass the input 2D list directly to `pd.DataFrame`.
- Provide the required column names: `student_id` and `age`.
- Return the constructed DataFrame.

## Why It Works

- Pandas creates one row per inner list, preserving the input order.
- The `columns` argument assigns the exact names required by the problem.
- Each inner list already stores the two required values in the expected order.

## Edge Cases

- Empty input would still produce a DataFrame with the requested columns.

## Complexity

- Time: $O(n)$ for `n` rows.
- Space: $O(n)$ for the returned DataFrame.

## Notes

- This is a Pandas solution, not Java; the explanation matches the imported `solution.py`.
