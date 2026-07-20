SELECT ROUND(sum(CASE WHEN DATEDIFF(t1.event_date, t2.first_event) = 1 THEN 1 ELSE 0 END)/COUNT(DISTINCT t1.player_id), 2) AS fraction
FROM Activity t1
JOIN
    (SELECT player_id, MIN(event_date) AS first_event
    FROM Activity
    GROUP BY player_id) t2
    ON t1.player_id = t2.player_id;
