WITH Stadium_Groups AS (
    SELECT
        id,
        visit_date,
        people,
        id - ROW_NUMBER() OVER(ORDER BY id) AS group_id
    FROM Stadium
    WHERE people >= 100
)
SELECT id, visit_date, people
FROM Stadium_Groups
WHERE group_id IN (
        SELECT group_id
        FROM Stadium_Groups
        GROUP BY group_id
        HAVING COUNT(*) >= 3
    )
ORDER BY visit_date;
