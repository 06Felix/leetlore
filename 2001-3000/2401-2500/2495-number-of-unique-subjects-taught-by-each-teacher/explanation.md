# Explanation

Problem: [Number of Unique Subjects Taught by Each Teacher](https://leetcode.com/problems/number-of-unique-subjects-taught-by-each-teacher/)

## Idea

Group rows by teacher and count distinct subject ids for each teacher.

## Why It Works

A teacher can appear multiple times for the same subject in different departments, but the problem asks for unique subjects. `COUNT(DISTINCT subject_id)` counts each subject once within a teacher's group. Grouping by `teacher_id` produces one output row per teacher with that distinct count.

## Edge Cases

- Teaching the same subject in multiple departments counts once.
- Teachers with one subject return `1`.

## Complexity

- Time: `O(n)` grouping work in a typical execution plan.
- Space: `O(t + s)` for teacher groups and distinct subject tracking.
