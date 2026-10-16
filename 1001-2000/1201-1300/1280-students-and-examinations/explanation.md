# Students and Examinations

## Idea

- Form every student-subject pair with Students JOIN Subjects without an ON condition. LEFT JOIN matching Examinations rows, group by student and subject, and count matched examination student IDs.

## Why It Works

- The Cartesian product supplies required rows even for zero attendance. The left join contributes one row per recorded exam attempt, including duplicates; COUNT of the nullable joined student ID excludes the unmatched placeholder and gives zero when appropriate.

## Edge Cases

- Students with no exams still need a row for every subject. Repeated exam rows must be counted as separate attendances.

## Complexity

- Plan-dependent: with suitable joins, roughly O(S * B + E) aggregation work plus ordering, and O(S * B) result/group storage for S students, B subjects, and E exam rows. An unindexed join can be substantially slower.

## Notes

- The query orders only by student_id, so subject_name order within a student is not guaranteed even though the problem requires both keys. Some column references are unqualified across joined tables; SQLite rejected the original query with ambiguous column name: student_id. MySQL behavior was not executed or verified. The existing SQL is unchanged.
