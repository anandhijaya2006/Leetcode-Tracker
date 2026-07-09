-- Last updated: 7/9/2026, 3:07:58 PM

UPDATE salary SET sex = 
CASE sex
WHEN 'm' THEN 'f'
ELSE 'm'
END;
 