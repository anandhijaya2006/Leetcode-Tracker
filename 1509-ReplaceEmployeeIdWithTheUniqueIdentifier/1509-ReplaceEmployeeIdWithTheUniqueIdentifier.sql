-- Last updated: 7/9/2026, 3:07:00 PM
# Write your MySQL query statement below
SELECT euni.unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI euni
ON e.id = euni.id;