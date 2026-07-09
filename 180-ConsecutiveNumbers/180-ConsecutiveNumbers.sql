-- Last updated: 7/9/2026, 3:10:04 PM
with cte as(
    select num,
    lead(num,1) over() num1,
    lead(num,2) over() num2
    from logs
)
select distinct num ConsecutiveNums from cte where(num = num1) and (num = num2)