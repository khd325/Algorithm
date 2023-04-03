select A.CATEGORY, A.price, A.product_name from food_product as A
join(
    select CATEGORY, max(price) as max_price from food_product group by category
) as B on A.CATEGORY = B.CATEGORY and B.max_price = A.price
where A.category in ('과자', '국', '김치', '식용유') order by A.price desc;
