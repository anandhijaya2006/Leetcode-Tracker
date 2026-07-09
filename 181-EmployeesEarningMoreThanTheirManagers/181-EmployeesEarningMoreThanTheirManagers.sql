-- Last updated: 7/9/2026, 3:10:03 PM
SELECT e.name as Employee
FROM Employee e
INNER JOIN Employee m
ON e.managerID = m.id
WHERE e.salary > m.salary;