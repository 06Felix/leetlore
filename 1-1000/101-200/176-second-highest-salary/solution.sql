select
(select distinct Salary 
from Employee order by salary desc 
limit 1, 1) 
as SecondHighestSalary;
