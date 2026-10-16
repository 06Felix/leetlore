with cte as (
    select product_id,
        sum(unit) as unit
    from Orders
    where left(order_date, 7) = '2020-02'
    group by 1
    having unit >= 100
)

select product_name,
       unit 
from cte
left join Products p
on cte.product_id =  p.product_id
