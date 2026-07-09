-- Last updated: 7/9/2026, 3:06:59 PM
# Write your MySQL query statement below
SELECT u1.name, COALESCE(SUM(r1.distance), 0) AS travelled_distance
FROM Users u1
LEFT JOIN Rides r1
ON u1.id = r1.user_id
GROUP BY u1.name, u1.id
ORDER BY travelled_distance DESC, u1.name ASC;