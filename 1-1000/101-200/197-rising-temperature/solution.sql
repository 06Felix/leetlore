SELECT t.id FROM Weather AS t
INNER JOIN Weather AS y
  ON (DATE_SUB(t.recordDate, INTERVAL 1 DAY) = y.recordDate)
WHERE t.temperature > y.temperature;
