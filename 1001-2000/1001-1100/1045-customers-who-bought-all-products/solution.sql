WITH total_count AS (
    SELECT COUNT(DISTINCT product_key) AS cnt
    FROM Product
)
SELECT customer_id
FROM Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT product_key) = (SELECT cnt FROM total_count);
