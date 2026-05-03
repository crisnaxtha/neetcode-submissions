-- Write your query below
select s.name from sales_person s
where s.sales_id NOT IN (


select s.sales_id
from sales_person s
join orders o on s.sales_id = o.sales_id
join company c on o.com_id = c.com_id
where
c.name = 'CRIMSON')