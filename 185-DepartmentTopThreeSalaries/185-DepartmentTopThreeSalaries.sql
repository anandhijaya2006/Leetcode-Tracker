-- Last updated: 7/9/2026, 3:09:56 PM
# Write your MySQL query statement below
select d.name as Department,e.name as Employee,e.salary as Salary from Employee e
left join Department d
on d.id=e.departmentId
where 3>=
    (select count(distinct salary) 
    from Employee as e2
    where e2.salary>=e.salary and 
    e2.departmentId=e.departmentId
    )
;
