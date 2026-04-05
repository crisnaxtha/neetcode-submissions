-- Write your query below

select 
distinct c.customer_id
from customers c 
where c.revenue > 0
and c.year = 2020;
