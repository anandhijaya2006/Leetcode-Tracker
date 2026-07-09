-- Last updated: 7/9/2026, 3:10:11 PM
SELECT
p.firstName,
p.LastName,
a.city,
a.state
FROM Person P
LEFT JOIN Address a
ON p.personId = a.personId;

