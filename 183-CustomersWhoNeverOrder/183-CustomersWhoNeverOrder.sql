-- Last updated: 7/9/2026, 3:10:00 PM
SELECT name as Customers
from Customers
where id not in (
    select customerId
    from Orders
);