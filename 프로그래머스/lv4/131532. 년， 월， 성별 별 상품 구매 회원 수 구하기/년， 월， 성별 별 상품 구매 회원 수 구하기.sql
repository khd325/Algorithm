select year(sales_date) as year , month(sales_date) as month, info.gender, count(distinct(info.user_id))
from user_info as info join online_sale as sale
on info.user_id = sale.user_id
where info.gender is not null
group by year(sales_date), month(sales_date), info.gender
order by year,month, gender

