SELECT e.name "Employee"
FROM Employee e
WHERE e.salary > (SELECT salary
                    FROM Employee
                    WHERE id = e.managerId);
