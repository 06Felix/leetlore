select mgr.employee_id ,mgr.name,COUNT(emp.reports_to) AS reports_count,ROUND(Avg(emp.age),0) AS average_age
from Employees emp join Employees mgr
on  mgr.employee_id = emp.reports_to
group by employee_id
order by employee_id
