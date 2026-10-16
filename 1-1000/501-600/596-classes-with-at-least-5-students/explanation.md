# Classes With at Least 5 Students

## Idea

- Group Courses by class and retain groups whose COUNT(student) is at least five.

## Why It Works

- The primary key (student, class) ensures one row per student in each class, so counting student entries gives the enrollment size. HAVING applies the threshold to each completed group.

## Edge Cases

- Exactly five students qualifies. Different classes are counted independently and may share students.

## Complexity

- Plan-dependent: roughly O(R) expected aggregation time and O(C) group workspace for R enrollment rows and C classes; sorting aggregation can require O(R log R).

## Notes

- COUNT(student) counts non-NULL students, consistent with the composite primary key. The original query passed a SQLite fixture; MySQL was not executed.
