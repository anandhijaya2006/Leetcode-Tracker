-- Last updated: 7/9/2026, 3:09:48 PM
SELECT w2.id
FROM Weather w1
join Weather w2
ON DATEDIFF (w1.recordDate ,w2.recordDate) = -1
AND w2.temperature>w1.temperature