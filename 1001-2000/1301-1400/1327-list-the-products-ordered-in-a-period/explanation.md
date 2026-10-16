# List the Products Ordered in a Period

## Idea

- In a CTE, filter Orders to February 2020 with LEFT(order_date, 7), group by product ID, and keep totals of at least 100 units. LEFT JOIN the qualifying totals to Products to retrieve names.

## Why It Works

- Filtering before aggregation counts only the required month. Summing unit preserves duplicate order rows as genuine additional orders; grouping by ID avoids combining different products with equal names. The primary-key lookup then supplies each qualifying product name.

## Edge Cases

- Exactly 100 units qualifies. The February prefix includes leap day. The foreign-key guarantee makes a matching product row available even though the query uses LEFT JOIN.

## Complexity

- Plan-dependent: approximately O(O + P + G) expected work for hash aggregation/join, or indexed lookups after aggregation; sort-based grouping may cost O(O log O), for O orders, P products, and G groups.

## Notes

- MySQL permits the unit aggregate alias in HAVING. Applying LEFT to the date may prevent a simple date-range index lookup. This MySQL-specific statement was reviewed but not executed on MySQL.
