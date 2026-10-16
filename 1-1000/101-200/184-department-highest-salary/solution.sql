WITH MaxSalaryByDept
AS (
	SELECT DepartmentId, max(Salary) AS MaxEmpSalary
	FROM Employee
	GROUP BY DepartmentId
)
SELECT D.Name "Department" ,E.Name "Employee", E.Salary
FROM Department AS D
INNER JOIN Employee AS E ON D.Id = E.DepartmentId
INNER JOIN MaxSalaryByDept AS MS ON D.Id = MS.DepartmentId
AND E.Salary = MS.MaxEmpSalary
