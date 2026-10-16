SELECT Students.student_id, student_name, Subjects.subject_name, COUNT(Examinations.student_id) AS attended_exams
FROM Students JOIN Subjects
LEFT JOIN Examinations
ON Students.student_id = Examinations.student_id AND Subjects.subject_name = Examinations.subject_name
GROUP BY Students.student_id, subject_name
ORDER BY student_id;
