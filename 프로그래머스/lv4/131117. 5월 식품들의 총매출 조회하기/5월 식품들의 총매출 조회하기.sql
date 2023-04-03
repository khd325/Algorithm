select product.product_id, product.product_name, product.price * sum(orders.amount) as total_sales from food_product as product
join food_order as orders
on product.product_id = orders.product_id
where date_format(orders.produce_date, '%Y-%m') = '2022-05'
group by product.product_id
order by total_sales desc, product.product_id;