-- Last updated: 7/9/2026, 3:08:05 PM
select *, if(x+y>z and y+z>x and x+z>y, "Yes","No") as triangle from triangle