-- Last updated: 7/9/2026, 3:08:23 PM
with cte as (
    select  a.name as name,a.id as idd,a.managerId as am,b.managerId as bm from employee as a
    left join employee as b
    on a.id=b.managerId
    group by b.managerId
    having  count(*)>=5
) select name  from cte  
where idd=bm 