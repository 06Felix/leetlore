SELECT SA.machine_id, ROUND(AVG(EA.timestamp - SA.timestamp), 3) AS processing_time
FROM Activity AS SA
INNER JOIN Activity AS EA
  USING (machine_id, process_id)
WHERE
  SA.activity_type = 'start'
  AND EA.activity_type = 'end'
GROUP BY 1;
